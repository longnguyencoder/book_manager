package com.example.book_manager_backend.config;

import com.example.book_manager_backend.entity.Category;
import com.example.book_manager_backend.entity.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.metamodel.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;


@Configuration
public class MethodRestConfig implements RepositoryRestConfigurer {

    private String url ="http://localhost:8080";
    @Autowired
    private EntityManager entityManager;

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry corsRegistry) {
        HttpMethod[] blockMethods = {
                HttpMethod.POST,
                HttpMethod.PUT,
                HttpMethod.DELETE,
                HttpMethod.PATCH,
        };
//        cho phep id khi tra ve json
        config.exposeIdsFor(
                entityManager.getMetamodel().getEntities().stream()
                        .map(Type::getJavaType)
                        .toArray(Class[]::new));
//    config.exposeIdsFor(Category.class);
        exampleMethods(Category.class,config,blockMethods);
        HttpMethod[] methodsDelete = {
                HttpMethod.DELETE,
        };
        exampleMethods(User.class,config,methodsDelete);
    }
    private  void  exampleMethods(Class c,RepositoryRestConfiguration config,HttpMethod[] method) {
        config.getExposureConfiguration()
                .forDomainType(c)
                .withItemExposure((metdata, httpMethods) -> httpMethods.disable(method))
                .withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(method));
    }
}
