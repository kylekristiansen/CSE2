/////////////////////////////////////////////////////////////////////////////////

arrays are complex and extremely useful

primary purpose of a computer?
    make human lives easier by doing computations we can't do
    
arrays help with automation
    it is a single variable name for a bulk of data
    they are LISTS OF ENTRIES OF THE SAME DATA TYPE
    size of list is only limited by the machines memory
    
in order to use an array:
    1. declare an array
    2. allocate spce for the array
        designation of space to create for the array
    3. access/initialize the individual members of the array

declare an array:        int[] <variableName>
    int[] and int are not the same
    
allocate the array:      <variableName> = new int[<variable with an int value of space to store>]
    'new' is a special operator that allocates memory for a particular data structure
    
initializing the data: 
    <arrayName>[0] = <same type as array>
    <arrayName>[1] = <same type as array>
    <arrayName>[2] = <same type as array>
    .......

if you aren't sure how long a string is:
    int[] <arrayName> = new int[10];
    int size = <arrayName>.length;
    // size contains an int value for how long your array is, which would be 10
    
    
    
int[] <arrayName> = new int[<arrayLength>];
    members:    <arrayName>[0]
                <arrayName>[1]
                <arrayName>[2]
                <arrayName>[3]
                <arrayName>[4]
                .....
    
    


example: {
    
    int NUM_STUDENTS = 5000;
    int[] studentIds;
    studentIds = new int[NUM_STUDENTS];
    
}



















