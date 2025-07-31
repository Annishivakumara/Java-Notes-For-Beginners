File:-

  
                                    
File class does not. It deals directly with files and the file system. That is, the File class does not
specify how information is retrieved from or stored in files; it describes the properties
of a file itself. A File object is used to obtain or manipulate the information associated
with a disk file, such as the permissions, time, date, and directory path, and to navigate
subdirectory hierarchies.
	
Files are a primary source and destination for data within many programs.
Although there are severe restrictions on their use within applets for security reasons,
files are still a central resource for storing persistent and shared information. A
directory in Java is treated simply as a File with one additional property—a list of
filenames that can be examined by the list( ) method.
	
	The following constructors can be used to create File objects:

File(String directoryPath)
File(String directoryPath, String filename)
File(File dirObj, String filename)
File(URI uriObj)

      1.PROBLEMS:-
	
The following example creates three files: f1, f2, and f3. The first File object is
constructed with a directory path as the only argument. The second includes two
arguments—the path and the filename. The third includes the file path assigned to f1
and a filename; f3 refers to the same file as f2.

	Solution:- 
	
	File f1 = new File("/");
	File f2 = new File("/","autoexec.bat");
	File f3 = new File(f1,"autoexec.bat");

	Note:-
		
File defines many methods that obtain the standard properties of a File object.
	For example, 
	
	getName( ) returns the name of the file, getParent( ) returns the name of the
	parent directory, and exists( ) returns true if the file exists, false if it does not. The File class,
	however, is not symmetrical. By this, we mean that there are many methods that allow you
	to examine the properties of a simple file object, but no corresponding function exists to
	change those attributes. 
	
	The following example demonstrates several of the File methods:

	Note:-
		
	The second utility method is delete( ), which deletes the disk file represented by the
	path of the invoking File object. It is shown here:
	
	boolean delete( )
	You can also use delete( ) to delete a directory if the directory is empty. 
	delete( )
	returns true if it deletes the file and false if the file cannot be removed.


	Method Description
		
	1.void deleteOnExit( ) :-
		Removes the file associated with the
		invoking object when the Java Virtual Machine terminates.
		
	2.boolean isHidden( ) :- Returns true if the invoking file is
		hidden. Returns false otherwise.

	3.boolean setLastModified(long millisec):- Sets the time stamp on the invoking
	file to that specified by millisec, which is the number of milliseconds from January 1, 1970, Coordinated Universal Time (UTC).
		
	4.boolean setReadOnly( ):- Sets the invoking file to read-only
