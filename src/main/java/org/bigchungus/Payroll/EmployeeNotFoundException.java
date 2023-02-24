package org.bigchungus.Payroll;

/***
 * This class is used to throw an exception when an employee is not found.
 * Renders HTTP 404 error.
 */
class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException(Long id) {
        super("Could not find employee " + id);
    }
}
