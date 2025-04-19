package com.amalvadkar.sbfaia.analyzer;

import org.hibernate.tool.schema.spi.SchemaManagementException;
import org.springframework.boot.diagnostics.AbstractFailureAnalyzer;
import org.springframework.boot.diagnostics.FailureAnalysis;

public class SchemaValidationFailureAnalyzer extends AbstractFailureAnalyzer<SchemaManagementException> {

    @Override
    protected FailureAnalysis analyze(Throwable rootFailure, SchemaManagementException cause) {
        String description = "❌ Schema validation failed at startup!\n\n" +
                             "❗ Reason: " + cause.getMessage() + "\n\n" +
                             "💡 Suggestions:\n" +
                             "- Check if all columns exist in the database.\n" +
                             "- Sync your @Entity classes with the actual database schema.\n" +
                             "- Did you forget to run schema.sql or apply a Flyway migration?";

        String action = "Review the error and fix the database schema before restarting.";

        return new FailureAnalysis(description, action, cause);
    }
}
