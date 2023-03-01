package org.bigchungus.Payroll;

enum Status implements jakarta.transaction.Status {
    IN_PROGRESS,
    COMPLETED,
    CANCELLED
}