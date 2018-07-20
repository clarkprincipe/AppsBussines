
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,AssetsFinder,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, assetsFinder: AssetsFinder)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <title>"""),_display_(/*6.17*/title),format.raw/*6.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*7.54*/assetsFinder/*7.66*/.path("stylesheets/bootstrap/bootstrap.css")),format.raw/*7.110*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*8.59*/assetsFinder/*8.71*/.path("images/favicon.png")),format.raw/*8.98*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*9.54*/assetsFinder/*9.66*/.path("stylesheets/custom/login.css")),format.raw/*9.103*/("""">
    </head>
    <body class="text-center">
        """),_display_(/*12.10*/content),format.raw/*12.17*/("""
        """),format.raw/*13.9*/("""<script src=""""),_display_(/*13.23*/assetsFinder/*13.35*/.path("javascripts/jquery/jquery-3.3.1.min.js")),format.raw/*13.82*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*14.23*/assetsFinder/*14.35*/.path("javascripts/bootstrap/bootstrap.js")),format.raw/*14.78*/("""" type="text/javascript"></script>
    </body>

</html>
"""))
      }
    }
  }

  def render(title:String,assetsFinder:AssetsFinder,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,assetsFinder)(content)

  def f:((String,AssetsFinder) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,assetsFinder) => (content) => apply(title,assetsFinder)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Jul 20 10:23:14 PET 2018
                  SOURCE: /home/clarkprincipe/AppsBussines/app/views/main.scala.html
                  HASH: 07e31ebf34af26bcfe405eb47fbf5a13b5334dcc
                  MATRIX: 746->1|898->60|925->61|1011->121|1036->126|1124->188|1144->200|1209->244|1296->305|1316->317|1363->344|1445->400|1465->412|1523->449|1605->504|1633->511|1669->520|1710->534|1731->546|1799->593|1883->650|1904->662|1968->705
                  LINES: 21->1|26->2|27->3|30->6|30->6|31->7|31->7|31->7|32->8|32->8|32->8|33->9|33->9|33->9|36->12|36->12|37->13|37->13|37->13|37->13|38->14|38->14|38->14
                  -- GENERATED --
              */
          