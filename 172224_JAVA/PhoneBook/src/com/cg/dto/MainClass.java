 

	PhoneEntry search(String targetLastName, String targetFirstName)

	{

	  for (int j = 0; j < phoneBook.length; j++)

	  {

	    if (phoneBook[j].firstName.equals(targetFirstName)||phoneBook[j].lastName.equals(targetLastName))

	      return phoneBook[j];

	  }


	}

	 

	}

	 

	class PhoneBookTester

	{

	  public static void main(String[] args)


	   Scanner scan = new Scanner(System.in);
64
	 
65
	   PhoneBook pb = new PhoneBook();
66
	 
67
	   System.out.println("Enter last name: ");
68
	   String lastNameEntry = scan.nextLine();
69
	 
70
	   System.out.println("Enter first name: ");
71
	   String firstNameEntry = scan.nextLine();
72
	 
73
	   PhoneEntry entry = pb.search(lastNameEntry, firstNameEntry);
74
	 
75
	      if (entry != null)
76
	        System.out.println(entry.lastName +", " + entry.firstName + ": " + entry.phone);
77
	      else
78
	        System.out.println("Name not found");
79
	       
80
	     System.out.println("Enter last name: ");
81
	     lastNameEntry = scan.nextLine();
82
	     
83
	       System.out.println("Enter first name: ");
84
	       firstNameEntry = scan.nextLine();
85
	 
86
	 
87
	     entry = pb.search(lastNameEntry, firstNameEntry);
88
	 
89
	     
90
	  }
91
	}
