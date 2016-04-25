import org.fluentlenium.adapter.FluentTest;
import static org.fluentlenium.core.filter.FilterConstructor.*;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
    return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
    goTo("http://localhost:4567/");
  }

  @Test
  public void containsPackageTest() {
    goTo("http://localhost:4567/");
    fill("#Length").with("2");
    fill("#Width").with("2");
    fill("#Depth").with("2");
    fill("#Weight").with("2");
    submit(".btn");
    assertThat(pageSource()).contains("8.00 to ship!");
  }

}
