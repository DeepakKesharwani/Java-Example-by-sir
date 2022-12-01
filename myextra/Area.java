class Area
{
	double calculateArea(double radius){
		double area = 3.14*radius*radius;
		return area;
	}
	double calculateArea(double length,double width){
		double area = length*width;
		return area;
	}
	double calculateArea(double height,double width,double length){
		double area = length*width*height;
		return area;
	}



}