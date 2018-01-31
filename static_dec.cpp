#include<iostream.h>
#include<conio.h>
class si{
	private:  int principle, time;
		  float roi;
		  static float simI;
	public:   void getdata();
		  void putdata();

};
float si::simI;
void si::getdata(){
	cout<<"enter principle\n";
	cin>>principle;
	cout<<"enter time in years";
	cin>>time;
	cout<<"enter rate of interest";
	cin>>roi;
}
void si::putdata(){
	simI = (principle * time * roi) / 100;
	cout<<"simple interest is "<<simI;
}


void main(){
	clrscr();
	si s1;
	s1.getdata();
	s1.putdata();
	getch();
}
