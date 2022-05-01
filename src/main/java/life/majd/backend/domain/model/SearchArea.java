package life.majd.backend.domain.model;

import org.springframework.data.geo.Point;

public class SearchArea {

  private Point point;
  private double radius;

  public Point getPoint() {
    return point;
  }

  public void setPoint(Point point) {
    this.point = point;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }
}
