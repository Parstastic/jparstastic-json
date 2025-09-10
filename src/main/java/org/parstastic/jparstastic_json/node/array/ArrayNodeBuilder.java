package org.parstastic.jparstastic_json.node.array;

import org.parstastic.jparstastic_json.node.JsonNode;
import org.parstastic.jparstastic_json.node.builders.JsonNodeWithInnerDelimitersBuilder;
import org.parstastic.jparstastic_json.parser.FullStringJsonParser;
import org.parstastic.jparstastic_json.parser.exceptions.InvalidJsonArrayNodeException;

/**
 * This class is responsible for parsing <code>JSON</code> strings into {@link ArrayNode} objects.
 */
public class ArrayNodeBuilder extends JsonNodeWithInnerDelimitersBuilder<ArrayNode, InvalidJsonArrayNodeException, JsonNode> {
    /**
     * Creates an {@link ArrayNodeBuilder} object.
     */
    public ArrayNodeBuilder() {
        super(ArrayNode.DELIMITER_START, ArrayNode.DELIMITER_END, ArrayNode.DELIMITER_ELEMENTS, new FullStringJsonParser());
    }

    /**
     * Creates an {@link ArrayNode} object with parsed {@link #elements}.
     *
     * @return an {@link ArrayNode} object with parsed {@link #elements}
     */
    @Override
    protected ArrayNode createNode() {
        return new ArrayNode(this.elements);
    }

    /**
     * Creates an {@link InvalidJsonArrayNodeException}.
     *
     * @return an {@link InvalidJsonArrayNodeException}
     */
    @Override
    protected InvalidJsonArrayNodeException createException() {
        return new InvalidJsonArrayNodeException();
    }
}
