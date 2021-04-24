<%@ include file="header.jsp" %>
<%@ include file="navlibrarian.jsp" %>

<jsp:useBean id="bookdetails" class="com.example.LibraryManagement.objects.Books"
             scope="session"></jsp:useBean>
<jsp:setProperty property="*" name="bookdetails"/>
<div class="container">
    Book details:<br>
    <jsp:getProperty property="callno" name="bookdetails"/><br>
    <jsp:getProperty property="name" name="bookdetails"/><br>
    <jsp:getProperty property="author" name="bookdetails"/><br>
    <jsp:getProperty property="publisher" name="bookdetails" /><br>
    <jsp:getProperty property="quantity" name="bookdetails"/><br>
</div>

<%@ include file="footer.jsp" %>
