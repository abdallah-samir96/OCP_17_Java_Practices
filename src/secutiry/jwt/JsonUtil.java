package secutiry.jwt;

import java.util.Iterator;
import java.util.Map;

public class JsonUtil {

    public static String toJson(Map<String, Object> map) {
        StringBuilder json = new StringBuilder("{");

        Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<String, Object> entry = it.next();

            json.append("\"")
                    .append(escape(entry.getKey()))
                    .append("\":");

            Object value = entry.getValue();

            if (value == null) {
                json.append("null");
            } else if (value instanceof Number || value instanceof Boolean) {
                json.append(value);
            } else {
                json.append("\"")
                        .append(escape(value.toString()))
                        .append("\"");
            }

            if (it.hasNext()) {
                json.append(",");
            }
        }

        json.append("}");

        return json.toString();
    }

    private static String escape(String value) {
        return value
                .replace("\\", "\\\\")
                .replace("\"", "\\\"");
    }
}