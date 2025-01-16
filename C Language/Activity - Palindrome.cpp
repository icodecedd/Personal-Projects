#include<header.h>
#define p printf 
main()
{
	char word1[25];
	char word2[25];
	
	p("Enter a word: ");
	gets(word1);
	strcpy(word2,word1);
	strrev(word1);		
	if(stricmp(word1,word2)==0)
		puts("\nThe Word is Palindrome");
	else
		puts("\nThe Word is not Palindrome");
}
