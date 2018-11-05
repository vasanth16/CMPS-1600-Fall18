

// Created by Vasanth Rajasekaran on 11/3/18.

#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>



 struct linked_list {
    // Linked list struct w
    int data;
    struct linked_list* next;

};

struct linked_list*  addFirst (struct linked_list *head, int val){
    struct linked_list * newNode = malloc(sizeof(struct linked_list)); // Makes a new node

    newNode->data = val;
    newNode->next = head;
    head = newNode;

    return head;

}

struct linked_list* removeF(struct linked_list *head){
    head = head->next;
    free(head);
    return head;
}


/*int main(){

    struct linked_list* head = malloc(sizeof(struct linked_list));

    head->data = 1;

    head->next = malloc(sizeof(struct linked_list));

    head->next->data = 2;



    struct linked_list * curr;

    head = addFirst(head, 5);

    printf("%d\n",head->data);
    printf("%d\n", head->next->data);
    printf("%d\n", head->next->next->data);

    head = removeF(head);
    printf("%d\n",head->data);
}*/