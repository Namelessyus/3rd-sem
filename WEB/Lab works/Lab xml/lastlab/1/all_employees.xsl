<!-- all_employees.xsl -->
<?xml-stylesheet type="text/xsl" href="all_employees.xsl"?>
  <xsl:template match="/organization">
    <html>
      <body>
        <h2>Employee Records</h2>
        <table border="1">
          <tr>
            <th>ID</th><th>Name</th><th>Department</th><th>Gender</th>
            <th>Experience</th><th>Email</th><th>City</th><th>Joining Year</th>
          </tr>
          <xsl:for-each select="employee">
            <tr>
              <td><xsl:value-of select="id"/></td>
              <td><xsl:value-of select="name"/></td>
              <td><xsl:value-of select="department"/></td>
              <td><xsl:value-of select="gender"/></td>
              <td><xsl:value-of select="experience"/></td>
              <td><xsl:value-of select="email"/></td>
              <td><xsl:value-of select="city"/></td>
              <td><xsl:value-of select="joiningYear"/></td>
            </tr>
          </xsl:for-each>
        </table>
      </body>
    </html>
  </xsl:template>
</xsl:stylesheet>
