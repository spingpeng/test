<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
<maps>
 

    <xsl:for-each select="maps/map">
    <map>
    <code><xsl:value-of select="code"/></code>
      <value><xsl:value-of select="value"/></value>    
    </map>   
    </xsl:for-each>
 </maps>
 </xsl:template>
 </xsl:stylesheet>
