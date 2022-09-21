/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Book8.Chapter5;

/**
 *
 * @author User
 */
public class Tags {
    
}

/*
Tags
Like Hypertext Markup Language (HTML), XML uses tags to mark the data. Here’s
a bit of XML that describes a book:
<Book>
<Title>Java All-In-One For Dummies</Title>
<Author>Lowe</Author>
</Book>
This chunk of XML defines an element called Book, which contains information
for a single book. The Book element in turn contains two subordinate elements:
Title and Author.
Notice that each element begins with a tag that lists the element’s name. This tag
is called the start tag. The element ends with an element that repeats the element
name, preceded by a slash — an end tag.
Everything that appears between the start tag and the end tag is the element’s
content, which can consist of text data or of one or more additional elements. In
the latter case, the additional elements nested within an element are called child
elements, and the element that contains them is called the parent element.
The highest-level element in an XML document is called the root element. A properly
formed XML document consists of a single root element, which can contain
elements nested within it. Suppose that you want to create an XML document
with information about two movies. The XML document might look something
like this:
<Movies>
<Movie>
<Title>It's a Wonderful Life</Title>
<Year>1946</Year>
<Price>14.95</Price>
</Movie>
<Movie>
<Title>Young Frankenstein</Title>
<Year>1974</Year>
<Price>16.95</Price>
</Movie>
</Movies>
Here the root element named Movies contains two Movie elements, each of which
contains Title, Year, and Price elements.
*/

/*
Although XML superficially resembles HTML, you find two key differences:
»»The tags used in HTML indicate the format of data that displays, whereas tags
in an XML document indicate the meaning of the data. HTML has tags such as
<B> and <I> that indicate whether data is bold or italic, for example. By
contrast, an XML document that holds information about books may have
tags such as <Title> and <Author> that provide the title and author
of the book.
»»The tags used in an HTML document are set in stone, whereas you can make
up any tags you want to use in an XML document. If you’re creating an XML
document about cars, you may use tags such as <Make>, <Model>, and
<Year>. But if you’re creating an XML document about classes taught at a
university, you may use tags such as <Course>, <Title>, <Instructor>,
<Room>, and <Schedule>.
*/
