# MVVMExample
This is basic tutorial for beginner of MVVM
This is simple example of pure MVVM (Model VIew View-Model) android architecture example using Data Binding, ViewModel and many more features.

In this example we can find three packages 
1. Model
2. View
3. ViewModel

Model-- It can your pojo class of your model like- UserLogin, ApiResponseModel etc
View- This is basically a Activity or Fragment that has enable Data biniding as


    ActivityLoginBinding  binding =DataBindingUtil.setContentView(this, R.layout.activity_login);
		
 
 Here you can set your model to viewmodel
 
        	 LoginViewModel loginViewModel = new LoginViewModel(activity);
					 
           binding.setLoginData(loginViewModel);  // for bind the ViewModel
					 
					 
In the Layout add

	<layout>

    <data class="ActivityLoginBinding">

        <variable
            name="loginData"
            type="com.mvvmexample.viewmodel.LoginViewModel" />   this is your viewmodel class
    </data>
		<EditText
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_margin="10dp"
            android:hint="Username"
            android:imeOptions="actionNext"
            android:inputType="textEmailAddress"
            android:text="@={loginData.dataEmail}" />     //always use @={loginData.dataEmail} for getting the value from model and @{loginData.dataEmail} for set the dynamically value
	
	</layout>
		
		In the viewmodel class
		
         @Bindable
         public String getDataEmail() {
           return loginModel.getEmail();
            }
		 
		Add @Bindable for bind the view     
Note: Make sure that "DataEmail" should be same as in the layout name  @={loginData.dataEmail} 
    



        
				
ViewModel-- This is the main class that can cominucate with both View and Model
					The ViewModel class is designed to store and manage UI-related data in a lifecycle conscious way. 
					The ViewModel class allows data to survive configuration changes such as screen rotations
        	ViewModel lifecycle is binded with the Activity or Fragment life Cycle
					
					All the business logic will be implemented in viewmodel class.
					You can add all your work like  Webserices calling, Map, Tab,TabHost, Facebook , GoogleSignIn in your ViewModel
					
					
					
Note:- 	ViewModel is extends by BaseObservable so that you can get your xml view easily
				You can also use Observable , Event Bus , Live Data for communication with the view and model.
				
																			

///Run the Project

1. Download or add the github repo
2. Launch the Login Activity---
		when you add anything in email field of edittext it is automatically show to textview that is below the password
		
		 notifyPropertyChanged(BR.dataEmail);   
		 // This is used to have instant change in the text view with respect to edittext value
		 
You can make change accordingly to your business logic	 
			
        

