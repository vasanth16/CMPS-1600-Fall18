#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <strings.h>
#include <stdbool.h>

struct linkedlist * globalHead;
struct linkedlist * connections;

struct person {
    struct linkedlist *friends;
    char email [255];
    char fname [255];
    char lname [255];
    char age [2];
    char hometown[255];
    char hobby[255];
};

struct  linkedlist{
    struct person * data;
    struct linkedlist* next;
    struct person * connection1;
    struct person * connection2;
};
/*
void printC (){
    struct linkedlist * curr = connections;
    while (curr != NULL){
        printf("%s",connections->connection1->email);
        printf("%s",connections->connection2->email);

        curr = curr->next;
    }
}
*/
bool search (char * email){
    struct linkedlist * curr = globalHead;

    while (curr != NULL){
        if(strcmp(curr->data->email, email) == 0){
            return true;
        }
        curr= curr->next;
    }

}

bool searchCs (char * email1, char * email2){
    struct linkedlist * curr = connections;

    while (curr != NULL){
        if (strcmp(curr->connection1->email, email1) == 0 || strcmp(curr->connection1->email, email2) == 0 ){
            if (strcmp(curr->connection2->email, email1) == 0 || strcmp(curr->connection2->email, email2) == 0 ){
                return true;
            }
        }
        curr = curr->next;
    }
    return false;
}

bool searchC2 (char * email){
    struct linkedlist * curr = connections;

    while (curr != NULL){
        printf("YUH");
        if (strcmp(curr->connection1->email,email) == 0 ||strcmp(curr->connection2->email,email) == 0 ){
            return true;
        }
        curr = curr->next;
    }
    return false;
}

bool add (char* email){
    struct linkedlist * newNode = malloc(sizeof(struct linkedlist));

    if (search(email) == true){
        return false;
    }

    struct person * new = malloc(sizeof(struct person));
    strcpy(new->email, email);
    printf("Please enter the first name of the person");
    scanf("%s",new->fname);
    printf("Please enter the last name of the person");
    scanf("%s",new->lname);
    printf("Enter the age");
    scanf("%s",new->age);
    printf("Enter the hometown of the person");
    scanf("%s",new->hometown);
    printf("Enter the your hobby");
    scanf("%s",new->hobby);

    newNode->data = new;
    newNode->next = globalHead;
    globalHead = newNode;

    return true;
}

bool removeCs (char * email1){
    struct linkedlist* temp = connections, *prev;

    if (connections == NULL){
        return false;
    }

    if (strcmp(temp->connection1->email, email1) == 0){
            connections = connections->next;
            printf("YEEE: %s\n", connections->connection1->email);
            free(temp);
            return true;
        }
    else if (strcmp(temp->connection2->email, email1) == 0 ){
        connections = connections->next;
        free(temp);
        return true;
    }

    while (strcmp(temp->connection1->email, email1) != 0 || strcmp(temp->connection2->email, email1) != 0 ){
            prev = temp;
            temp = temp->next;
    }
    if (temp == NULL) return false;

    prev->next = temp->next;
    free(temp);


}

bool removee (char email[]){
    printf("Enters remove");
    if (searchC2(email) == true){
        printf("Hello");
        removeCs(email);
    }

    struct linkedlist* temp = globalHead, *prev;

    if (temp != NULL && strcmp(temp->data->email, email) == 0)
    {
        globalHead = temp->next;
        free(temp);
        return true;
    }


    while (temp != NULL && strcmp(temp->data->email, email) != 0)
    {
        prev = temp;
        temp = temp->next;
    }

    if (temp == NULL) return false;

    prev->next = temp->next;



    free(temp);
}

void showInfo (struct linkedlist * head){
    printf("1.Email: %s\n2.First name: %s\n3.Last Name: %s\n4.Age: %s\n5.Hometown: %s\n6.Hobby: %s\n", head->data->email, head->data->fname, head->data->lname, head->data->age, head->data->hometown, head->data->hobby);
}

bool edit (char* email){
    int choice;
    char temp [255];
    if (search(email) == false){
        return false;
    }
    while (globalHead != NULL){
        if (strcmp(globalHead->data->email, email) == 0){
            showInfo(globalHead);
            printf("Type the number of the data you want to edit, else enter 9");
            scanf("%d", &choice);
            if (choice == 1){
                printf("Enter new email");
                scanf("%s", temp);
                strcpy(globalHead->data->email, temp);
            } else if (choice == 2){
                printf("Enter new first name");
                scanf("%s", temp);
                strcpy(globalHead->data->fname, temp);
            } else if(choice==3){
                printf("Enter new last name");
                scanf("%s", temp);
                strcpy(globalHead->data->lname, temp);
            } else if (choice == 4){
                printf("Enter new age");
                scanf("%s", temp);
                strcpy(globalHead->data->age, temp);
            } else if (choice == 5){
                printf("Enter new hometown");
                scanf("%s", temp);
                strcpy(globalHead->data->hometown, temp);
            } else if (choice == 6){
                printf("Enter new hobby");
                scanf("%s", temp);
                strcpy(globalHead->data->hobby, temp);
            } else if (choice == 9){
                return true;
            }
        }
    }
}

bool connect (char * email1, char * email2){
    printf("Enters Connect\n");
    if (search(email1) == false || search(email2) == false){
        printf("enters if 1\n");
        return false;
    }
    if (searchCs(email1,email2) == true){
        printf("Enters if 2\n");
        return false;
    }
    struct person *temp1 = NULL;
    struct person *temp2 = NULL;

    struct linkedlist * curr = globalHead;
    struct linkedlist * newNode = malloc(sizeof(struct linkedlist));


    while (curr != NULL) {
        printf("Enters while loop\n");
        if (strcmp(curr->data->email, email1) == 0) {
            temp1 = curr->data;
        }
        else if (strcmp(curr->data->email, email2) == 0){
            temp2 = curr->data;
        }

        if (temp1!= NULL && temp2 != NULL){
            newNode->connection1 = temp1;
            newNode->connection2 = temp2;
            newNode->next = connections;
            connections = newNode;
           // return true;
        }
        curr = curr->next;
    }


}

int main() {
    char choice [5];
    char email1[30];
    char email2 [30];
/*
    printf("Hello and welcome to the social network\n" );
    while (strcmp(choice,"x") != 0) {
        printf("Here are your choices: \n a - add \n r - remove \n e - edit\n c - connect\n x - exit\n");
        scanf("%s", choice);
        if (strcmp(choice, "a") == 0 ) {
            printf("Please enter your email: ");
            scanf("%s",email1);
            add(email1);
        }
        if (strcmp(choice, "r") == 0 ){
            printf("Please enter your email: ");
            scanf("%s",email1);
            removee(email1);
        }
        if (strcmp(choice, "e") == 0 ) {
            printf("Please enter your email: ");
            scanf("%s", email1);
            edit(email1);
        }

        if (strcmp(choice,"c")== 0){
            printf("Please enter email 1: ");
            scanf("%s", email1);
            printf("please enter Email 2: ");
            scanf("%s", email2);
            connect(email1,email2);
            printf("%s\n", connections->connection1->email);
            printf("%s\n", connections->connection2->email);
        }

        printf("%s\n", globalHead->data->fname);

    }
*/

    add("v");
    printf("%s\n", globalHead->data->email);
    add("b");
    printf("%s\n", globalHead->data->email);
    add("f");
    printf("%s\n", globalHead->data->email);
    connect(&"v", &"f");
    //printf("%s\n", connections->connection1->email);
    //printf("%s\n", connections->connection2->email);
    removee("f");
    printf("\nFinal Head: %s\n", globalHead->data->email);
    printf("%s\n", connections->connection1->email);
    printf("%s\n", connections->connection2->email);



}