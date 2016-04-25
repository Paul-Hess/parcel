import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (req, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/package", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();

      int width = Integer.parseInt(request.queryParams("Width"));
      int length = Integer.parseInt(request.queryParams("Length"));
      int depth = Integer.parseInt(request.queryParams("Depth"));
      int weight = Integer.parseInt(request.queryParams("Weight"));

      Package myPackage = new Package(width, length, depth, weight);
      model.put("myPackage", myPackage);

      model.put("template", "templates/package.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());


  }

}
