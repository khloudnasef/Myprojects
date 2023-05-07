/*McDOL Browser History System is a backtracking program using Stack concept*/

#include <iostream>
#include <iomanip>
using namespace std;
struct History
{
 string websitename;
 double entry;
 History *link;
};
//top pointer-element (global)
History *top = NULL;
History *Newnode;
//checking if stack is empty
bool isempty ()
{
 if (top == NULL)
 {
 return true;
 }
 else
 {
 return false;
 
}
}
void push (string websitename, double entry)
{
 Newnode = new History;
 Newnode->entry = entry;
 Newnode->websitename = websitename;
 Newnode->link = top;
 top = Newnode;
}
void pop ()
{
 if (isempty ())
 cout << "\nThere is nothing to remove. Browser History is Empty...\n";
 else
 {
 cout << "----------------------------------------------------------------" << endl;
 cout << "\tThe Recent browser has been Removed from History! : " << endl;
 cout << "----------------------------------------------------------------" << endl;
 cout << left << setw (20) << "Website Name" << setw (20) << "Time Entry"<< endl;
 cout << endl;
 cout << left << setw (20) << top->websitename << setw (20) << top->entry << endl;
 top = top->link;
 }
}
void disTop ()
{
 if (isempty ())
 {
 cout << "\nBrowser History is Empty...\n";
 }
 else
 {
 cout << "--------------------------------------------" << endl;
 cout << "\tThe current Website is : " << endl;
 cout << "--------------------------------------------" << endl;

 cout << left << setw (20) << "Website Name" << setw (20) << "Time Entry"<< endl;
 cout << endl;
 cout << left << setw (20) << top->websitename << setw (20) << top->entry << endl;
 }
}
void wholeStack ()
{
 if (isempty ())
 {
 cout << "\nBrowser History is Empty...\n";
 }
 else
 {
 History *disnode = top;
 cout << "--------------------------------------------" << endl;
 cout << "\tBrowser History Records : " << endl;
 cout << "--------------------------------------------" << endl;
 cout << left << setw (20) << "Website Name" << setw (20) << "Time Entry"<< endl;
 cout << endl;
 while (disnode != NULL)
{
cout << left << setw (20) << disnode-> websitename << setw (20) << disnode->entry<<endl;
 disnode = disnode->link;
}
 cout << "\n";
 }
}
int main ()
{
 int choice, session = 1;

 double timeentry;
 string website;
 cout << "=========================================================" << endl;
 cout << "\t\tMcDOL Browser History System" << endl;
 cout << "=========================================================" << endl;
 while (session = 1)
 {
 cout <<"\n1.Insert New Website. \n2.Delete Current Website. \n3.Display Current Website. \n4.Show Website History \n5.Exit Browser History"<< endl;
 cin >> choice;
 switch (choice)
{
case 1:
 cout << "Enter Website Name (without spacing) : \n";
 cin >> website;
 cout << "Enter Time Entry (24hr Format) : \n";
 cin >> timeentry;
 push (website, timeentry);
 break;
case 2:
 pop ();
 break;
case 3:
 disTop ();
 break;
case 4:

 wholeStack ();
 break;
case 5:
 session = 0;
 return 0;
 break;
}
 }
 return 0;
}
