/*McDol Pharmacy is a program that allows user to manage and organize the queue for each 
prescription order*/

#include <iostream>
#include <string>
#include <iomanip>
using namespace std;
void enqueue(int value, string name);
void dequeue();
void display();
void queuefront();
void queuerear();
bool isEmpty();
int optionmenu;
struct order
{
 int number;
 string name;
 struct order* link;
};
order* front = NULL;
order* rear = NULL;
order* newN;
order* ptr;
int main()
{
 int value;
 string name;
 char answer;
 do
 {
 cout << "=========================================================\n";
 cout << "\t\tMcDOL PHARMACY QUEUE\t\n";
 cout << "=========================================================\n";
 cout << "Press [1] To Add Prescription Order Number." << endl;
 cout << "Press [2] To Delete Prescription Order Number." << endl;
 cout << "Press [3] Display Prescription Queue." << endl;
 cout << "Press [4] View Prescription Order Number at front." << endl;
 cout << "Press [5] View Prescription Order Number at rear." << endl;
 cout << "Press [6] EXIT\n" << endl;
 cout << "Option: ";
 cin >> optionmenu;
 if (optionmenu == 1)
 {
 do {
 system("cls");
 cout << "Enter Patient Name: ";
 cin >> ws;
 getline(cin, name);
 cout << "Enter Prescription Order Number: ";
 cin >> value;
 enqueue(value, name);
 cout << endl;
 cout << "Insert more to Prescription Queue? Press Y for Yes and N for No: \n";
 cin >> answer;
 cout << endl;
 } while (toupper(answer) == 'Y');
 }
 else if (optionmenu == 2)
 {
 system("cls");
 dequeue();
 }
 else if (optionmenu == 3)
 {
 system("cls");
 display();
 }
 else if (optionmenu == 4)
 {
 system("cls");
 queuefront();
 }
 else if (optionmenu == 5)
 {
 system("cls");

 queuerear();
 }
 else if (optionmenu == 6)
 {
 exit(0);
 }
 cout << endl;
 cout << "Do you wish to return to Main Menu? Press Y for Yes and N for No: ";
 cin >> answer;
 system("cls");
 cout << endl;
 } while (toupper(answer) == 'Y');
 return 0;
}
bool isEmpty()
{
 if (front == NULL && rear == NULL)
 return true;
 else
 return false;
}

void enqueue(int value, string name)
{
 newN = new order;
 newN->name = name;
 newN->number = value;
 newN->link = NULL;
 if (front == NULL)
 {
 front = newN;
 rear = newN;
 }
 else
 {
 rear->link = newN;
 rear = newN;
 }
}
void dequeue()
{
 if (isEmpty())
 cout << "Prescription Queue is empty...\n";
 else {
 cout << "Prescription order number deleted from prescription queue is: \n" << endl;
 cout << "----------------------------------------------------------" << endl;
 cout << left << setw(30) << "Patient's Name " << setw(30) << "Prescription Order Number" << endl;
 cout << "----------------------------------------------------------" << endl;
 cout << endl;
 cout << left << setw(30) << front->name << setw(30) << front->number << endl;
 if (front == rear)
 {
 free(front);
 front = NULL;
 rear = NULL;
 }
 else
 {
 ptr = front;
 front = front->link;
 free(ptr);
 }
 }


}
void display()
{
 if (isEmpty())
 cout << "Prescription Queue is empty...\n";
 else
 {
 ptr = front;
 cout << "\t\tPRESCRIPTION QUEUE LIST\t\t" << endl;
 cout << "----------------------------------------------------------" << endl;
 cout << left << setw(30) << "Patient's Name " << setw(30) << "Prescription Order Number" << endl;
 cout << "----------------------------------------------------------" << endl;
 cout << endl;
 while (ptr != NULL)
 {
 cout << left << setw(30) << ptr->name << setw(30) << ptr->number << endl;
 ptr = ptr->link;
 }
 }
}
void queuefront()
{
 if (isEmpty())
 cout << "Prescription Queue is empty...\n";
 else
 cout << "Prescription Queue at the front: \n" << endl;
 cout << "----------------------------------------------------------" << endl;
 cout << left << setw(30) << "Patient's Name " << setw(30) << "Prescription Order Number" << endl;
 cout << "----------------------------------------------------------" << endl;
 cout << endl;
 cout << left << setw(30) << front->name << setw(30) << front->number << endl;
}
void queuerear()
{
 if (isEmpty())
 cout << "Prescription Queue is empty...\n";
 else
 cout << "Prescription Queue at the back: \n" << endl;
 cout << "----------------------------------------------------------" << endl;
 cout << left << setw(30) << "Patient's Name " << setw(30) << "Prescription Order Number" << endl;
 cout << "----------------------------------------------------------" << endl;
 cout << endl;
 cout << left << setw(30) << rear->name << setw(30) << rear->number << endl;
}
