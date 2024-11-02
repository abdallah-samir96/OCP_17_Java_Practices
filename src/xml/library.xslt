<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/library">
        <html>
            <body>
                <h2>My Library Collection XSLT(Xml Stylesheet for language transformation)</h2>
                <table border="1">
                    <tr bgcolor="#9acd32">
                        <th>Book Title</th>
                        <th>Book Author</th>
                        <th>Book Pages</th>
                        <th>Book Type</th>
                    </tr>
                    <xsl:for-each select="book">
                        <tr>
                            <td><xsl:value-of select="title" /></td>
                            <td><xsl:value-of select="author" /></td>
                            <td><xsl:value-of select="pages" /></td>
                            <td><xsl:value-of select="type" /></td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>

