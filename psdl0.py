# # print("and")
# # num = 29
# # a = "aaa"
# # print(a)
# # a = 90
# # print(a)
# # value= input()
# # print(value)
# # for i in range(5):
# #     print(i)
# #     if(i==4):
# #         break
# #
# #
# # # To take input from the user
# # #num = int(input("Enter a number: "))
# #
# # # define a flag variable
# # flag = False
# #
# # # prime numbers are greater than 1
# # if num > 1:
# #     # check for factors
# #     for i in range(2, num):
# #         if (num % i) == 0:
# #             # if factor is found, set flag to True
# #             flag = True
# #             # break out of loop
# #             break
# #
# # # check if flag is True
# # if flag:
# #     print(num, "is not a prime number")
# # else:
# #     print(num, "is a prime number")
#
c = int(input("enter principle value"))
d = float(input("enter rate of interest"))
e = int(input("enter number of years"))
si = (c*d*e)/100
print(si)

def menu():
    print("********MENU********")
    print("1.Addition")
    print("2.Subtraction")
    print("3.Multiplication")
    print("4.Division")
    print("5.Factorial")
    print("6.Other")
    print("7.Exit")

def add(c,d):
    e = c + d
    print(e)


def multiply(a,b):
    c = a * b
    print(c)

def division(a,b):
    if(a>b):
        c = a/b
    elif(b>a):
        c = b/a
    print(c)

def sub(a,b):
    if(a>b):
        c = a-b
    elif(b>a):
        c = b-a
    print(c)

loop = True
while loop:
    c = int(input("enter c"))
    d = int(input("enter d"))
    menu()
    choice = input("enter your choice [1 to 7]")
    if(choice == '1'):
        add(c,d)

    elif(choice == '2'):
        sub(c,d)
    elif(choice == '3'):
        multiply(c,d)
    elif(choice == '4'):
        division(c,d)
    else:
        print("wrong input . enter any key to try again")
#
#
# def print_menu():       ## Your menu design here
#     print 30 * "-" , "MENU" , 30 * "-"
#     print "1. Menu Option 1"
#     print "2. Menu Option 2"
#     print "3. Menu Option 3"
#     print "4. Menu Option 4"
#     print "5. Exit"
#     print 67 * "-"
#
# loop=True
#
# while loop:          ## While loop which will keep going until loop = False
#     print_menu()    ## Displays menu
#     choice = input("Enter your choice [1-5]: ")
#
#     if choice==1:
#         print "Menu 1 has been selected"
#         ## You can add your code or functions here
#     elif choice==2:
#         print "Menu 2 has been selected"
#         ## You can add your code or functions here
#     elif choice==3:
#         print "Menu 3 has been selected"
#         ## You can add your code or functions here
#     elif choice==4:
#         print "Menu 4 has been selected"
#         ## You can add your code or functions here
#     elif choice==5:
#         print "Menu 5 has been selected"
#         ## You can add your code or functions here
#         loop=False # This will make the while loop to end as not value of loop is set to False
#     else:
#         # Any integer inputs other than values 1-5 we print an error message
#         raw_input("Wrong option selection. Enter any key to try again..")
# mylist = [1,2,4,5,[6,7,8]]
# print(mylist[4][1])