</!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
</head>
<body>
	<h1>File handling in Java</h1>
	<p>In Java, a File is an abstract data type. A named location used to store related information is known as a File. There are several File Operations like creating a new File, getting information about File, writing into a File, reading from a File and deleting a File.</p>
	
	<h2>Stream</h2>
	<p>A series of data is referred to as a stream. In Java, Stream is classified into two types, i.e., Byte Stream and Character Stream.</p>
	<a href="https://static.javatpoint.com/core/images/file-operations-in-java.png" target="blank"><img width="400" height="400" src="https://static.javatpoint.com/core/images/file-operations-in-java.png" alt="Java File Operations"/></a> 
	<h3>Character Stream</h3>
	<p>Character Stream is mainly involved with character data. A file handling process with a character stream is a process in which an input is provided and executed with the character data.</p>
	<a href=""></a><p>To get more knowledge about the stream click here!</p>
	<h3>File operations</h3>
	<li>
		Create a file
	</li>
	<li>
		Get file information
	</li>
	<li>
		Write to a file
	</li>
	<li>
		Read from a file
	</li>
	<li>
		Delete a file
	</li>
	<h4>Create a File</h4>
	<p>Create a File operation is performed to create a new file. We use the createNewFile() method of file. The createNewFile() method returns true when it successfully creates a new file and returns false when the file already exists.</p>
	<p><b>Get File Information</b></p>
	<p>The operation is performed to get the file information. We use several methods to get the information about the file like name, absolute path, is readable, is writable and length.<p>
		<p>1. We get the name of the file using the getName()</p>
		<p>2. We get the absolute path of the file using the getAbsolutePath() method of the file.</p>
		<p>3. We check whether we can write data into a file or not using the canWrite()</p>
		<p>4. We check whether we can read the data of the file or not using the canRead()</p>
		<p>5. We get the length of the file by using the length()</p>
	<p><b>Write to a file</b></p>
	<p>The next operation which we can perform on a file is "writing into a file". In order to write data into a file, we will use the FileWriter class and its write() method together. We need to close the stream using the close() method to retrieve the allocated resources.</p>

<p><b>Read from a File</b></p>
<p>The next operation which we can perform on a file is "read from a file". In order to write data into a file, we will use the Scanner class. Here, we need to close the stream using the close() method. We will create an instance of the Scanner class and use the hasNextLine() method nextLine() method to get data from the file.	
</p>
<p><b>Delete a File</b></p>
<p>The next operation which we can perform on a file is "deleting a file". In order to delete a file, we will use the delete() method of the file. We don't need to close the stream using the close() method because for deleting a file, we neither use the FileWriter class nor the Scanner class.</p>




</body>
</html>