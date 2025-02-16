package dev.blufantasyonline.embercore.config.serialization.jackson.builtins.spigot.vector;


import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import dev.blufantasyonline.embercore.reflection.annotations.OnEnable;
import org.bukkit.util.Vector;

import java.io.IOException;

@OnEnable
public class VectorDeserializer extends StdDeserializer<Vector> {
    protected VectorDeserializer() {
        super(Vector.class);
    }

    @Override
    public Vector deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        ObjectCodec codec = jsonParser.getCodec();
        JsonNode root = codec.readTree(jsonParser);

        double x = root.get("x").asDouble();
        double y = root.get("y").asDouble();
        double z = root.get("z").asDouble();

        return new Vector(x, y, z);
    }

    @Override
    public Object deserializeWithType(JsonParser p, DeserializationContext ctxt, TypeDeserializer typeDeserializer) throws IOException {
        return super.deserializeWithType(p, ctxt, typeDeserializer);
    }
}
