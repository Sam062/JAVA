	// RADIX SORT using Linked List //

#include<iostream>
using namespace std;
class Radix_sort
{
	public :
	int size,i,largest,count;
	
	void create()
	{
		node *item,*temp;
		temp=start;
		cout<<"enter the size :";
		cin>>size;
		cout<<"\nEnter the value : ";
		for(i=0;i<size;i++)
		{
			item=new node;
			cin>>item->num;
			item->next=NULL;
			if(start==NULL)
		{
			start=item;
			end=item;
		}
		else
		{
			end->next=item;
			end=item;
		}
		}
	}
	
	void  disp()
	{
		node *temp;
		temp=start;
		int largest=0;
		cout<<"\nTHE LIST IS :\n";
		while(temp!=NULL)
		{
			cout<<temp->num<<"  ";
			temp=temp->next;
		}
	}
	
	int large()
	{
		node *temp;
		temp=start;
		int lrg=0;
		while(temp!=NULL)
		{
			if(lrg<temp->num)
				lrg=temp->num;
			temp=temp->next;
		}
		cout<<"\nlargest="<<lrg;
		while(lrg>0)
		{
			count++;
			lrg=lrg/10;
		}
		cout<<"\nNO OF DIGITS In The Largest Element :"<<count;
		return count;
	}
	void radix()
	{
		int i,k,digit,least_sig,most_sig;
		struct node *rear[10], *front[10], *p;
		least_sig=1;
		most_sig=large();
		 for(k = least_sig; k <= most_sig; k++) 
      {
            for(count = 0; count <= 9; count++)
            {
                  rear[count] = NULL;
                  front[count] = NULL ;
            }
            for(p = start; p != NULL; p = p->next)
            {
                  digit = digit_finder(p->num, k);
                  if(front[digit] == NULL) 
                  {
                        front[digit] = p;
                  }
                  else
                  {
                        rear[digit]->next= p;
                  }
                  rear[digit] = p;
            }
            //disp();
            count = 0;
            while(front[count] == NULL)
            {
                  count++;
            }
            start = front[count]; 
            while(count < 9) 
            {
                  if(rear[count + 1] != NULL)
                  {
                        rear[count]->next = front[count + 1];
                  }
                  else
                  {
                        rear[count + 1] = rear[count];
                  }
                  count++;
            }
            rear[9]->next = NULL;
      }
	}
	
	int digit_finder(int number, int k)
	{
		int term, count;
      for(count = 1; count <= k; count++)
      {
            term = number % 10;
            number = number / 10;
      }
      return(term);
	}
struct node
{
	int num;
	node *next;
}*start=NULL, *end=NULL;
};	//closing of class

	int main()
	{
		Radix_sort A;
		A.create();
		A.disp();
		A.radix();
		A.disp();
		
		return 0;
	}



