package practicaAula.util;

import io.javalin.http.Context;
import io.javalin.http.Handler;

import static practicaAula.util.RequestUtil.*;

import java.util.HashMap;
import java.util.Map;

public class ViewUtil {

    public static Map<String, Object> baseModel(Context ctx) {
        Map<String, Object> model = new HashMap<>();
        model.put("msg", new MessageBundle(getSessionLocale(ctx)));
        model.put("currentUser", getSessionCurrentUser(ctx));
        return model;
    }

    public static Handler notFound = ctx -> {
        ctx.render(Path.Template.NOT_FOUND, baseModel(ctx));
    };

}
