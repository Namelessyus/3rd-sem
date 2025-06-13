<!-- sort_by_joining_year.xsl -->
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
  <xsl:template match="/organization">
    <html>
      <body>
        <h2>Employees Sorted by Joining Year</h2>
        <table border="1">
          <tr>
            <th>Name</th><th>Joining Year</th>
          </tr>
          <xsl:for-each select="employee">
            <xsl:sort select="joiningYear" data-type="number" order="ascending"/>
            <tr>
              <td><xsl:value-of select="name"/></td>
              <td><xsl:value-of select="joiningYear"/></td>
            </tr>
          </xsl:for-each>
        </table>
      </body>
    </html>
  </xsl:template>
</xsl:stylesheet>
