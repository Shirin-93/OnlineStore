# OnlineStore
This is a simple command line application for an Online store. The application has a CLI user interface which allow user to shop and check out.

## Products Class
A products class is created with getters, setters and constructors and methods. The class has the following properties:
1) Id
2) Name
3) Price

## Store Home Screen
The application loads the store's inventory file from the provided "inventory.csv" file.

# Screens
### Home Screen 
To display:
1) Products
2) Cart
3) Exit

### Products Screen
This displays a list of line items that the customer has added to their cart. It should also display the total amount of the cart. A
customer can choose from the following options
1) C - to Check Out
2) X - to go back to the home screen

### CheckOut Screen
This displays the total amount owed for this order and prompt the user for payment. Once the item is sold, the user is taken back to home screen. 