/*A simple library management system*/

#include <iostream>
#include <fstream>
#include <iomanip>
#include <string>
#include <stdio.h>
using namespace std;
void Addnewbook();
void Searchbook();
void Addborrowbook();
void Bookreturn();
void mainmenu();
void displaybook();
void calc_chargedue();
const int arr = 500;
struct checkout_data {
 string name;
 string address;
 int phone;
 string date_checkout;
 string date_return;
 double charge;
};
struct Books {
 int book_no;
 string title;
 string author;
 string co_author;
 string publisher;
 string date_published;
 string subject;
 string keywords;
 checkout_data checkout;
}Books[arr];
void Addnewbook() {
 int y;
 fstream myFile;

 myFile.open("BookList.text", ios::out | ios::app);
 int b;
 cout << "\tNEW BOOK ENTRY\t" << endl;
 cout << endl;
 cout << "Number of Books to Add : ";
 cin >> b;
 cout << endl;
 for (int i = 0; i < b; i++)
 {
 cout << " Enter Book ID : ";
 cin >> Books[i].book_no;
 cout << endl;
 cout << " Enter Title : ";
 cin.ignore();
 getline(cin, Books[i].title);
 cout << endl;
 cout << " Enter Author : ";
 getline(cin, Books[i].author);
 cout << endl;
 cout << " Enter Co-author : ";
 getline(cin, Books[i].co_author);
 cout << endl;
 cout << " Enter Publisher : ";
 getline(cin, Books[i].publisher);
 cout << endl;
 cout << " Enter Published Date : ";
 getline(cin, Books[i].date_published);
 cout << endl;
 cout << " Enter Subject : ";
 getline(cin, Books[i].subject);
 cout << endl;
 cout << " Enter Keywords : ";
 getline(cin, Books[i].keywords);
 for (int i = 0; i < b; i++)
 {
 myFile << "Title of Book : " << Books[i].title << endl;
 myFile << "Author of Book : " << Books[i].author << endl;
 myFile << "Co-author of Book : " << Books[i].co_author << endl;
 myFile << "Subject of Book : " << Books[i].subject << endl;
 myFile << "Publisher of Book : " << Books[i].publisher << endl;
 myFile << "Date Book Published : " << Books[i].date_published << endl;
 myFile << "Keyword of Book : " << Books[i].keywords << endl;
 myFile << "Book ID : " << Books[i].book_no << endl;
 myFile << "\n";
 }
 cout << endl;

 cout << "Enter 1 To Return To Main Menu" << endl;
 cout << endl;
 cout << " Choice : ";
 cin >> y;
 system("cls");
 if (y == 1)
 {
 mainmenu();
 system("cls");
 }
 }
}
void Searchbook()
{
 int x;
 cout << "\tSEARCH BOOK ENTRY\t" << endl;
 cout << "\n";
 do
 {
 cout << "Choose a number to Search Book By :\n" << endl;
 cout << "[1] Author Name" << endl;
 cout << "[2] Book ID" << endl;
 cout << "[3] Book Subject" << endl;
 cout << "[4] Book Keyword" << endl;
 cout << "[5] EXIT TO MENU" << endl;
 cout << endl;
 cout << "Choice : ";
 cin >> x;
 cout << endl;
 system("cls");
 if (x == 1)
 {
 // search by author name
 string authorname;
 cout << "Enter Author Name: ";
 cin >> authorname;
 cout << endl;
 for (int i = 0; i < arr; i++)
 {
 if (authorname == Books[i].author)
 {
 cout << "Title of Book : " << Books[i].title << endl;
 cout << "Author of Book : " << Books[i].author << endl;
 cout << "Co-author of Book : " << Books[i].co_author << endl;

 cout << "Subject of Book : " << Books[i].subject << endl;
 cout << "Publisher of Book : " << Books[i].publisher << endl;
 cout << "Date Book Published : " << Books[i].date_published << endl;
 cout << "Keyword of Book : " << Books[i].keywords << endl;
 cout << "Book ID : " << Books[i].book_no << endl;
 }
 
 }
 system("pause");
 system("cls");
 }
 else if (x == 2)
 {
 // search by Book Id
 int bookid;
 cout << "Enter Book ID: ";
 cin >> bookid;
 cout << endl;
 for (int i = 0; i < arr; i++)
 {
 if (bookid == Books[i].book_no)
 {
 cout << "Title of Book : " << Books[i].title << endl;
 cout << "Author of Book : " << Books[i].author << endl;
 cout << "Co-author of Book : " << Books[i].co_author << endl;
 cout << "Subject of Book : " << Books[i].subject << endl;
 cout << "Publisher of Book : " << Books[i].publisher << endl;
 cout << "Date Book Published : " << Books[i].date_published << endl;
 cout << "Keyword of Book : " << Books[i].keywords << endl;
 cout << "Book ID : " << Books[i].book_no << endl;
 }
 
 }
 system("pause");
 system("cls");
 }
 else if (x == 3)
 {
 // Search By Subject
 string subbook;
 cout << "Enter Book Subject: ";
 cin >> subbook;
 cout << endl;
 for (int i = 0; i < arr; i++)
 {
 if (subbook == Books[i].subject)
 {
 cout << "Title of Book : " << Books[i].title << endl;

 cout << "Author of Book : " << Books[i].author << endl;
 cout << "Co-author of Book : " << Books[i].co_author << endl;
 cout << "Subject of Book : " << Books[i].subject << endl;
 cout << "Publisher of Book : " << Books[i].publisher << endl;
 cout << "Date Book Published : " << Books[i].date_published << endl;
 cout << "Keyword of Book : " << Books[i].keywords << endl;
 cout << "Book ID : " << Books[i].book_no << endl;
 }
 
 }
 system("pause");
 system("cls");
 }
 else if (x == 4)
 {
 // search by keyword
 string book_keyword;
 cout << "Enter Book Keyword: ";
 cin >> book_keyword;
 cout << endl;
 for (int i = 0; i < arr; i++)
 {
 if (book_keyword == Books[i].keywords)
 {
 cout << "Title of Book : " << Books[i].title << endl;
 cout << "Author of Book : " << Books[i].author << endl;
 cout << "Co-author of Book : " << Books[i].co_author << endl;
 cout << "Subject of Book : " << Books[i].subject << endl;
 cout << "Publisher of Book : " << Books[i].publisher << endl;
 cout << "Date Book Published : " << Books[i].date_published << endl;
 cout << "Keyword of Book : " << Books[i].keywords << endl;
 cout << "Book ID : " << Books[i].book_no << endl;
 }
 
 }
 system("pause");
 system("cls");
 }
 else if (x == 5)
 {
 // exit to menu
 mainmenu();
 }
 else
 {
 cout << "INVALID INPUT\n";
 system("pause");
 system("cls");
 mainmenu();
 }

 } while (x != 6);
}
void displaybook()
{
 int o;
 cout << "\tDISPLAY BOOK RECORDS\t" << endl;
 cout << "\n";
 ifstream myFile;
 string temp;
 myFile.open("BookList.text");
 if (myFile.is_open())
 {
 while (!myFile.eof())
 {
 while (getline(myFile, temp))
 {
 cout << temp << endl;
 }
 }
 }
 cout << endl;
 cout << "Enter 1 To Return To Main Menu" << endl;
 cout << endl;
 cout << " Choice : ";
 cin >> o;
 system("cls");
 if (o == 1)
 {
 mainmenu();
 system("cls");
 }
}
void Addborrowbook()
{
 int o;
 cout << "\tBORROW BOOK ENTRY\t" << endl;

 cout << "\n";
 
 cout << "Search By Book Title " << endl;
 cout << "\n";
 string booktitle;
 cout << "Enter Book Title : ";
 cin >> booktitle;
 cout << endl;
 for (int i = 0; i < arr; i++)
 {
 if (booktitle == Books[i].title)
 {
 cout << "Title of Book : " << Books[i].title << endl;
 cout << "Author of Book : " << Books[i].author << endl;
 cout << "Co-author of Book : " << Books[i].co_author << endl;
 cout << "Subject of Book : " << Books[i].subject << endl;
 cout << "Publisher of Book : " << Books[i].publisher << endl;
 cout << "Date Book Published : " << Books[i].date_published << endl;
 cout << "Keyword of Book : " << Books[i].keywords << endl;
 cout << "Book ID : " << Books[i].book_no << endl;
 }
 }
 int x;
 cout << endl;
 cout << "Do You Want To Borrow This Book?" << endl;
 cout << "\n";
 cout << "Press [1] To Continue" << endl;
 cout << "Press [2] To Exit To Main Menu" << endl;
 cout << endl;
 cout << "Choice : ";
 cin >> x;
 system("cls");
 int a;
 cout << endl;
 cout << "Number of Books being Borrowed : ";
 cin >> a;
 cout << endl;
 if (x == 1)
 {
 for (int i = 0; i < a; i++)
 {
 cin.ignore();
 cout << " Enter Name : ";
 getline(cin, Books[i].checkout.name);
 cout << endl;
 cout << " Enter Address : "; 
 getline(cin, Books[i].checkout.address);
 cout << endl;
 cout << " Enter Phone Number (+60) : ";

 cin >> Books[i].checkout.phone;
 cout << endl;
 cin.ignore();
 cout << " Enter Date Borrowed (dd/mm/yyyy): ";
 getline(cin, Books[i].checkout.date_checkout);
 }
 cout << endl;
 cout << "Enter 1 To Return To Main Menu" << endl;
 cout << endl;
 cout << " Choice : ";
 cin >> o;
 system("cls");
 if (o == 1)
 {
 mainmenu();
 system("cls");
 }
 }
 else if (x == 2)
 {
 mainmenu();
 }
}
void Bookreturn()
{
 cout << "\tBOOK RETURN\t" << endl;
 cout << "\n";
 string todaydate;
 cout << "Enter Today's Date (dd/mm/yyyy) : ";
 cin >> todaydate;
 cout << endl;
 cout << endl;
 int t;
 cout << "Search Borrowed Book By : \n" << endl;
 cout << "[1] Name" << endl;
 cout << "[2] Book Title" << endl;
 
 cout << endl;
 cout << "Choice : ";
 cin >> t;
 system("cls");
 if (t == 1)
 {
 string borrow_name;
 int b;

 cout << "Enter Name: ";
 cin >> borrow_name;
 for (int i = 0; i < arr; i++)
 {
 if (borrow_name == Books[i].checkout.name)
 {
 cout << "Name : " << Books[i].checkout.name << endl;; 
 cout << "Address : " << Books[i].checkout.address << endl; 
 cout << "Phone Number (+60) : " << Books[i].checkout.phone << endl; 
 cout << "Date Borrowed : " << Books[i].checkout.date_checkout << endl;
 cout << "Book Title : " << Books[i].title << endl;
 cout << endl;
 
 
 }
 else {
 cout << "No Such Book Borrowed" << endl;
 }
 cout << "\tCHARGES DUE\t " << endl;
 cout << endl;
 calc_chargedue();
 cout << endl;
 cout << "Press 1 to Return to Main Menu" << endl;
 cout << endl;
 cin >> b;
 if (b == 1)
 {
 system("cls");
 mainmenu();
 }
 else
 cout << "Thank You" << endl;
 exit(0);
 }
 }
 else if (t == 2)
 {
 string booktitle;
 char b;
 cout << "Enter Book Title: " ;
 cin >> booktitle;
 for (int i = 0; i < arr; i++)
 {
 if (booktitle == Books[i].title)
 {
 cout << "Name : " << Books[i].checkout.name << endl;;
 cout << "Address : " << Books[i].checkout.address << endl;

 cout << "Phone Number (+60) : " << Books[i].checkout.phone << endl;
 cout << "Date Borrowed : " << Books[i].checkout.date_checkout << endl;
 cout << "Book Title : " << Books[i].title << endl;
 cout << endl;;
 }
 else 
 {
 cout << "No Such Book Borrowed\n" << endl;
 }
 cout << "\tCHARGES DUE\t " << endl;
 cout << endl;
 calc_chargedue();
 cout << endl;
 cout << "Press 1 to Return to Main Menu" << endl;
 cout << endl;
 cin >> b;
 if (b == 1)
 {
 system("cls");
 mainmenu();
 }
 else
 cout << "Thank You" << endl;
 exit(0);
 }
 }
 else
 {
 int x;
 cout << "INVALID INPUT\n";
 cout << "endl";
 cout << "Press 1 to Return to Main menu\n";
 cin >> x;
 if (x == 1)
 {
 mainmenu();
 }
 } 
}
void calc_chargedue()
{
 
 string BookReturn[500];
 int totaldays;
 double fine = 0;

 int b;
 cout << "How many books to return: ";
 cin >> b;
 cout << endl;
 for (int j = 0; j < b; j++)
 {
 
 cout << "Enter Total Days Borrowed : ";
 cin >> totaldays; //how many days the book is borrowed from the library.
 cout << endl;
 if (totaldays <= 30)
 {
 fine = 0;
 }
 else if (totaldays > 30 && totaldays <= 40) // more than 30 days, less than 40. fine==RM0.50
 {
 fine = ((totaldays - 30) * 0.5);
 }
 else if (totaldays > 40 && totaldays <= 60) // more than 40 days, less than 60. fine==RM1
 {
 
 fine = (5 * 0.5) + ((totaldays - 40) * 1); 
 }
 else // more than 60 days . fine == RM1.5
 {
 
 fine = (5 * 0.5F) + (20 * 1) + ((totaldays - 60) * 1.5F); 
 cout << "Canceled your library membership with fine : RM " << fine << endl;
 }
 cout << "The Overdue Days : " << (totaldays - 30) << endl;
 cout << "Your total Fine : RM " << fine << endl;
 }
}
void mainmenu()
{
 int choice;
 cout << "\t[WELCOME TO VIRTUAL LIBRARY SYSTEM!]\t" << endl << endl;
 cout << "Press [1] to Add New Book" << endl;
 cout << "Press [2] to Search Book Detail" << endl;
 cout << "Press [3] to Display Book Record" << endl;
 cout << "Press [4] to Add Borrow Book Entry" << endl;
 cout << "Press [5] to Return Book" << endl;
 cout << "Press [6] to EXIT\n" << endl;

 cout << "Choice : ";
 cin >> choice;
 system("cls");
 if (choice == 1)
 
{
 Addnewbook();
 
}
 else if (choice == 2)
 
{
 Searchbook();
 
}
 else if (choice == 3)
 
{
 displaybook();
 
}
 else if (choice == 4)
 
{
 Addborrowbook();
 
}
 else if (choice == 5)
 
{
 Bookreturn();
 
}
 else if (choice == 6)
 
{
 exit(0);
 
}
 else
 
{
 cout <<"INVALID INPUT \n";
}

}

int main() {
 mainmenu(); 
 }
