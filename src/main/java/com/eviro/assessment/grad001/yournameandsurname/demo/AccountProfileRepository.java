package com.eviro.assessment.grad001.yournameandsurname.demo;
//The code defines the AccountProfileRepository interface within the package
// com.eviro.assessment.grad001.yournameandsurname.demo. This interface extends the CrudRepository interface, which is a
// part of Spring Data JPA

import org.springframework.data.repository.CrudRepository; //    This interface extends the CrudRepository interface,
    // which provides CRUD (Create, Read, Update, Delete) operations for the AccountProfile entity.
    // The first generic parameter, AccountProfile, specifies the entity type that this repository manages.
    // The second generic parameter, Long, specifies the type of the primary key of the AccountProfile entity.

public interface AccountProfileRepository extends CrudRepository<AccountProfile, Long> {
}

//By extending the CrudRepository interface, the AccountProfileRepository inherits a set of methods for performing
// common database operations, such as saving, updating, deleting, and retrieving AccountProfile entities. You can also
// define additional query methods in this interface based on your specific requirements.This interface acts as the
// repository that provides access to the database and allows you to perform database operations on the AccountProfile
// entities using Spring Data JPA's provided methods
