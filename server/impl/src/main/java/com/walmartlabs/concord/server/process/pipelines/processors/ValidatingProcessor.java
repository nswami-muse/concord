package com.walmartlabs.concord.server.process.pipelines.processors;

import com.walmartlabs.concord.server.process.Payload;

import javax.inject.Named;
import javax.ws.rs.WebApplicationException;
import java.nio.file.Path;
import java.util.Map;

import static javax.ws.rs.core.Response.Status.BAD_REQUEST;

/**
 * Validates that no unprocessed attachments left in a payload.
 */
@Named
public class ValidatingProcessor implements PayloadProcessor {
    @Override
    public Payload process(Payload payload) {
        Map<String, Path> attachments = payload.getAttachments();
        if (!attachments.isEmpty()) {
            String msg = "Validation error, unprocessed payload attachments: " + String.join(", ", attachments.keySet());
            throw new WebApplicationException(msg, BAD_REQUEST);
        }

        return payload;
    }
}
