/**
 * Created by schandramouli on 12/16/16.
 */
public class DependencyInversion {
    // Dependency injection is changing the way dependencies work
    // both the high level module and low level module must instead depend on abstractions
    // Also, abstractions must not depend on details, details must depend on abstractions
    // Imagine a external dependency - variable that you instantiate inside your class, this
    // is tightly coupled, if instead you passed in an argument to the constructor or method
    // that requires that variable, this is less tightly coupled, so while mocking also, you
    // could easily pass in a mocked argument instead of thinking about how to change the
    // instantiated variable (and mocking it)
}
