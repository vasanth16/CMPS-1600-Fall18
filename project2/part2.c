//
// Created by Vasanth Rajasekaran on 11/13/18.
//



#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <strings.h>
#include <stdbool.h>

struct linkedlist * globalHead; // Global Linked list of all the people
struct linkedlist * connections; // Global LL for the connections

struct person { // This is a person
    char email [255];
    char fname [255];
    char lname [255];
    char age [255];
    char hometown[255];
    char hobby[255];
};

struct  linkedlist{
    // This is the linked list Struct
    struct person * data; // The data in this  LL is a person
    struct linkedlist* next;
    struct person * connection1; // These connection variables are used for the connections LL only
    struct person * connection2;
};

/**
 * Checks if person already exists based on the email
 * @param email
 * @return
 */
bool search (char * email){
    //printf("Enters friends");
    struct linkedlist * curr = globalHead;

    while (curr != NULL){
        if(strcmp(curr->data->email, email) == 0){
            return true;
        }
        curr= curr->next;
    }
    return false;

}

/**
 * Searches if a connection between 2 people already exists using their emails
 * @param email1
 * @param email2
 * @return
 */
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

/**
 * checks if any connections with that email already exists
 * @param email
 * @return
 */
bool searchC2 (char * email){
    printf("Enters searchC2\n");
    struct linkedlist * curr = connections;

    while (curr != NULL){
        //printf("YUH");
        if (strcmp(curr->connection1->email,email) == 0 ||strcmp(curr->connection2->email,email) == 0 ){
            return true;
        }
        curr = curr->next;
    }
    return false;
}


/**
 * Adds a person to the global LL of people
 * @param email
 * @return
 */
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

/**
 * Removes connections of a person
 * @param email1
 * @return
 */

bool removeCs (char * email1){
    printf("Enters removeCS\n");
    struct linkedlist * temp = connections;
    struct linkedlist * prev = malloc(sizeof(struct linkedlist));

    if (connections == NULL){
        printf("Connections == NULL\n");
        return false;
    }

    if (strcmp(temp->connection1->email, email1) == 0){
        printf("first connection 1 is equal to the email passed in\n");
        printf("Before removal %s\n", connections->connection1->fname);
        connections = connections->next;
        printf("After removal: %s\n", connections->connection1->email);
        free(temp);
        return true;
    }
    else if (strcmp(temp->connection2->email, email1) == 0 ){
        printf("first connection 2 is equal to the email passed in\n");
        connections = connections->next;
        free(temp);
        return true;
    }

    while (strcmp(temp->connection1->email, email1) != 0 || strcmp(temp->connection2->email, email1) != 0){
        if (temp->next != NULL) {
            printf("enters while loop in removeCS\n");

            prev = temp;
            temp = temp->next;
        } else {
            break;
        }
    }

    printf("exits while loop on removeCS\n");
    if (temp == NULL) return false;

    prev->next = temp->next;
    free(temp);


}

/**
 * Removes a person from the LL of people
 * @param email
 * @return
 */

bool removee (char email[]){
    printf("Enters remove\n");


    struct linkedlist* temp = globalHead;
    struct linkedlist * prev = malloc(sizeof(struct linkedlist));

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

    while (searchC2(email) == true){
        //printf("Hello\n");
        removeCs(email);
    }
    printf("Done with remove\n");

    free(temp);
}

/**
 * Helper function for the edit function
 * Shows the information of a person
 * @param head
 */

void showInfo (struct linkedlist * head){
    printf("1.Email: %s\n2.First name: %s\n3.Last Name: %s\n4.Age: %s\n5.Hometown: %s\n6.Hobby: %s\n", head->data->email, head->data->fname, head->data->lname, head->data->age, head->data->hometown, head->data->hobby);
}

/**
 * Function to edit a person
 * @param email
 * @return
 */
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

/**
 * Creates a connection between two people
 * @param email1
 * @param email2
 * @return
 */
bool connect (char * email1, char * email2){
    printf("\n**Enters Connect**\n");
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



    while (curr != NULL) {
        printf("Enters while loop\n");
        if (strcmp(curr->data->email, email1) == 0) {
            printf("Enters while loop if 1\n");
            temp1 = curr->data;
        }
        else if (strcmp(curr->data->email, email2) == 0){
            printf("Enters while loop if 2\n");
            temp2 = curr->data;
        }

        if (temp1!= NULL && temp2 != NULL){
            struct linkedlist * newNode = malloc(sizeof(struct linkedlist));
            newNode->connection1 = temp1;
            newNode->connection2 = temp2;
            newNode->next = connections;
            connections = newNode;
            printf("Enters while loop if 3\n");

            return true;
        }
        curr = curr->next;
    }


}

/**
 * Display displays all the people in the social network and their connections
 */

void display(){
    struct linkedlist * currP = globalHead;

    while (currP != NULL){
        printf("\n %s {\n",currP->data->fname);
        struct linkedlist * currC = connections;
        while (currC != NULL){
            if (strcmp(currP->data->email,currC->connection1->email) ==0){
                printf("%s \n", currC->connection2->fname);
                currC = currC->next;
            }else if (strcmp(currP->data->email,currC->connection2->email) ==0){
                printf("%s \n", currC->connection1->fname);
                currC = currC->next;
            } else{
                currC = currC->next;
            }
        }
        currP = currP->next;
    }
    //printf("Done with display\n");
}

/**
 * Disconnects two people if their nodes exist
 * @param email1
 * @param email2
 * @return
 */

bool disconnect(char* email1, char* email2){
    printf("Enters disconnect\n");
    struct linkedlist * temp = connections;
    struct linkedlist * prev = malloc(sizeof(struct linkedlist));


    while (temp != NULL){
        if (strcmp(email1, temp->connection1->email) == 0 && strcmp(email2, temp->connection2->email) == 0){
            prev->next = temp->next;
            free(temp);
            return true;
        }else if (strcmp(email2, temp->connection1->email) == 0 && strcmp(email1, temp->connection2->email) == 0){
            prev->next = temp->next;
            free(temp);
            return true;
        } else{
            prev = temp;
            temp = temp->next;
        }
    }

}

/**
 * gets all the friends of a person given their email
 * @param email
 * @return
 */

bool getFriends(char* email){

    struct linkedlist * temp = connections;

    printf("\n%s's Friends are: \n",email);

    while (temp != NULL){
        if (strcmp(email, temp->connection1->email) == 0){
            printf("%s\n", temp->connection2->fname);
        } else if (strcmp(email, temp->connection2->email) == 0){
            printf("%s\n", temp->connection1->fname);
        }
        temp = temp->next;
    }


}

/**
 * Saves the network to a text file
 * @param peopleFilename
 * @param connectionsFilename
 * @return
 */

bool saveNetwork(char* peopleFilename, char* connectionsFilename){
    FILE *file1 = fopen(peopleFilename,"w");
    FILE *file2 = fopen(connectionsFilename,"w");

    struct linkedlist * tempP = globalHead;
    struct linkedlist * tempC = connections;



    if (file1 == NULL || file2 == NULL ){
        printf("Couldnt open file");
        return false;
    }

    while (tempP != NULL){
        fprintf(file1, "%s,%s,%s,%s,%s,%s\n", tempP->data->fname, tempP->data->lname, tempP->data->email, tempP->data->age, tempP->data->hometown, tempP->data->hobby);
        tempP = tempP->next;
    }
    fclose(file1);

    while (tempC != NULL){
        fprintf(file2, "%s,%s,\n", tempC->connection1->email, tempC->connection2->email);
        tempC = tempC->next;
    }
    fclose(file2);
    free(tempC);
    free(tempP);
    return true;

}

/**
 * Gets the network from a text file and imports it into the linkedlists
 * @param peopleFilename
 * @param connectionsFilename
 * @return
 */

bool retrieveNetwork(char* peopleFilename, char* connectionsFilename){
    FILE *file1 = fopen(peopleFilename,"r");
    FILE *file2 = fopen(connectionsFilename,"r");
    char line[255];
    char line2[255];
    char * token;
    //int counter = 0;

    //struct linkedlist * newNodeConnection = malloc(sizeof(struct linkedlist));


    if (file1 == NULL || file2 == NULL ){
        printf("Couldnt open file");
        return false;
    }


    while (fgets(line,sizeof(line),file1) != NULL) {
        printf("%s", line);
        token = strtok(line, ",");
        int counter = 0;
        struct person * newPerson = malloc(sizeof(struct person));
        struct linkedlist * newNodePerson = malloc(sizeof(struct linkedlist));
        while (counter < 6) {
            while (token != NULL) {
                printf("Enters while lopp\n");
                printf(" %s\n", token);

                //printf("%s",newPerson->data->fname);

                if (counter == 0) {
                    printf("This is the fname token: %s\n", token);
                    strcpy(newPerson->fname, token);
                } else if (counter == 1) {
                    printf("This is the lname token: %s\n", token);
                    strcpy(newPerson->lname, token);
                } else if (counter == 2) {
                    printf("This is the email token: %s\n", token);
                    strcpy(newPerson->email, token);
                } else if (counter == 3) {
                    printf("This is the age token: %s\n", token);
                    strcpy(newPerson->age, token);
                } else if (counter == 4) {
                    printf("This is the hometown token: %s\n", token);
                    strcpy(newPerson->hometown, token);
                } else if (counter == 5) {
                    printf("This is the hobby token: %s\n", token);
                    strcpy(newPerson->hobby, token);
                } else {
                    printf("Didnt enter anything\n");
                }
                counter++;

                token = strtok(NULL, ",");

            }
        }
        if (search(newPerson->email) == false) {
            newNodePerson->data = newPerson;
            newNodePerson->next = globalHead;
            globalHead = newNodePerson;
        }


    }

    while (fgets(line,sizeof(line),file2) != NULL){
        printf("This is the  line: %s\n", line);
        token = strtok(line, ",");

        struct linkedlist * newConnectionNode = malloc(sizeof(struct linkedlist));
        int counter = 0;
        while (token != NULL){
            //printf("Token:%s\n",token);
            struct linkedlist * curr = globalHead;
            printf("Enters token for loop\n");
            while (curr != NULL){
                printf("Enters global head loop\n");
                printf("Token:%s\n",token);
                printf("Current email:%s\n",curr->data->email );
                if (strcmp(token,curr->data->email) ==0){
                    printf("Enters token if\n");
                    if (counter == 0){
                        printf("Enters counter 0\n");
                        newConnectionNode->connection1 = curr->data;
                    }else {
                        printf("Enters counter 1\n");
                        newConnectionNode->connection2 = curr->data;
                    }
                }
                curr = curr->next;
            }
            token = strtok(NULL, ",");
            counter++;
        }
        newConnectionNode->next = connections;
        connections = newConnectionNode;
    }


}

/**
 * Has an interface with easy access to all functions
 * @return
 */
int main() {
    char choice[5];
    char email1[30];
    char email2[30];
    char peopleFilename[255];
    char connectionsFilename[255];

    printf("Hello and welcome to the social network\n");
    while (strcmp(choice, "x") != 0) {
        printf("Here are your choices: \n a - add \n r - remove \n e - edit\n c - connect\n d - display\n i - disconnect\n f - get Friends\n s - save Network\n n - retrieve Network\n x - exit\n");
        scanf("%s", choice);
        if (strcmp(choice, "a") == 0) {
            printf("Please enter your email: ");
            scanf("%s", email1);
            add(email1);
        }
        if (strcmp(choice, "r") == 0) {
            printf("Please enter your email: ");
            scanf("%s", email1);
            removee(email1);
        }
        if (strcmp(choice, "e") == 0) {
            printf("Please enter your email: ");
            scanf("%s", email1);
            edit(email1);
        }

        if (strcmp(choice, "c") == 0) {
            printf("Please enter email 1: ");
            scanf("%s", email1);
            printf("please enter Email 2: ");
            scanf("%s", email2);
            connect(email1, email2);
        }
        if (strcmp(choice, "d") == 0) {
            display();
        }
        if (strcmp(choice, "i") == 0) {
            printf("Please enter email 1: ");
            scanf("%s", email1);
            printf("please enter Email 2: ");
            scanf("%s", email2);
            disconnect(email1, email2);
        }
        if (strcmp(choice, "f") == 0) {
            printf("Please enter your email: ");
            scanf("%s", email1);
            getFriends(email1);
        }
        if (strcmp(choice, "s") == 0) {
            printf("Please enter the file name of people");
            scanf("%s", peopleFilename);
            printf("Please enter the file name of connections");
            scanf("%s", connectionsFilename);
            saveNetwork(peopleFilename, connectionsFilename);

        }
        if (strcmp(choice, "n") == 0) {
            printf("Please enter the file name of people");
            scanf("%s", peopleFilename);
            printf("Please enter the file name of connections");
            scanf("%s", connectionsFilename);
            retrieveNetwork(peopleFilename, connectionsFilename);

        }

    }

}