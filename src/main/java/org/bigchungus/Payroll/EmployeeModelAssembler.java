package org.bigchungus.Payroll;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

@Component
public class EmployeeModelAssembler implements RepresentationModelAssembler<Employee, EntityModel<Employee>> {
    /*
     * This method is called by the Spring HATEOAS library when it wants to create a
     * representation model for an Employee. It is called by the
     * EmployeeController's all() method.
     */
    @Override
    public EntityModel<Employee> toModel(Employee employee) {
        // uses EntityModel (vs RepresentationModel) as the mechanism
        // to easily wrap all POJOs as models.
        return EntityModel.of(employee,
                linkTo(methodOn(EmployeeController.class).one(employee.getId())).withSelfRel(),
                linkTo(methodOn(EmployeeController.class).all()).withRel("employees"));
    }
}
