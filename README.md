#File Operations in Java

In Java, a File is an abstract data type. A named location used to store related information is known as a File.
There are several File Operations like creating a new File, getting information about File, writing into a File, reading from a File and deleting a File.

Before understanding the File operations, it is required that we should have knowledge of Stream and File methods.
If you have knowledge about both of them, you can skip it.

*Stream*

A series of data is referred to as a stream. In Java, Stream is classified into two types, i.e., Byte Stream and Character Stream.

![](https://static.javatpoint.com/core/images/file-operations-in-java.png)

*Byte Stream*

Byte Stream is mainly involved with byte data.
A file handling process with a byte stream is a process in which an input is provided and executed with the byte data.

*Character Stream*

Character Stream is mainly involved with character data.
A file handling process with a character stream is a process in which an input is provided and executed with the character data.

*File Operations*

We can perform the following operation on a file:

- Create a File
- Get File Information
- Write to a File
- Read from a File
- Delete a File

*Create a File*

Create a File operation is performed to create a new file. We use the createNewFile() method of file. 
The createNewFile() method returns true when it successfully creates a new file and returns false when the file already exists.

*Get File Information*

The operation is performed to get the file information. We use several methods to get the information about the file like name, absolute path, is readable, is writable and length.

*Write to a File*

The next operation which we can perform on a file is "writing into a file". In order to write data into a file, we will use the FileWriter class and its write() method together.
We need to close the stream using the close() method to retrieve the allocated resources.

*Read from a File*

The next operation which we can perform on a file is "read from a file". In order to write data into a file, we will use the Scanner class. Here, we need to close the stream using the close() method. 
We will create an instance of the Scanner class and use the hasNextLine() method nextLine() method to get data from the file.

*Delete a File*

The next operation which we can perform on a file is "deleting a file". In order to delete a file, we will use the delete() method of the file.
We don't need to close the stream using the close() method because for deleting a file, we neither use the FileWriter class nor the Scanner class.