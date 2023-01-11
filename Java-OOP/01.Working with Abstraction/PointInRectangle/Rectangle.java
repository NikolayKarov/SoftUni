package PointInRectangle;

public class Rectangle {
    private Point bottomLeftPoint;
    private Point topRightPoint;

    public Rectangle(Point bottomLeftPoint, Point topRightPoint) {
        this.bottomLeftPoint = bottomLeftPoint;
        this.topRightPoint = topRightPoint;
    }

    public Point getBottomLeftPoint() {
        return bottomLeftPoint;
    }

    public void setBottomLeftPoint(Point bottomLeftPoint) {
        this.bottomLeftPoint = bottomLeftPoint;
    }

    public Point getTopRightPoint() {
        return topRightPoint;
    }

    public void setTopRightPoint(Point topRightPoint) {
        this.topRightPoint = topRightPoint;
    }

    public boolean contains(Point point) {
        boolean isInHorizontal =
                this.bottomLeftPoint.getX() <= point.getX() && this.topRightPoint.getX() >= point.getX();

        boolean isInVertical = this.bottomLeftPoint.getY() <= point.getY() && this.topRightPoint.getY() >= point.getY();

        return isInHorizontal && isInVertical;
    }
}
