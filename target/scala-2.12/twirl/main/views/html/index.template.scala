
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,AssetsFinder,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template takes a two arguments, a String containing a
 * message to display and an AssetsFinder to locate static assets.
 */
  def apply/*5.2*/(message: String)(implicit assetsFinder: AssetsFinder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*6.1*/("""
"""),format.raw/*11.4*/("""
"""),_display_(/*12.2*/main("Welcome to Play", assetsFinder)/*12.39*/ {_display_(Seq[Any](format.raw/*12.41*/("""

 """),format.raw/*14.2*/("""<form class="form-signin">
  <img class="mb-4" src=""""),_display_(/*15.27*/assetsFinder/*15.39*/.path("images/bootstrap/bootstrap-solid.svg")),format.raw/*15.84*/("""" alt="" width="72" height="72">
  <h1 class="h3 mb-3 font-weight-normal">Please sign in</h1>
  <label for="inputEmail" class="sr-only">Email address</label>
  <input type="email" id="inputEmail" class="form-control" placeholder="Email address" required autofocus>
  <label for="inputPassword" class="sr-only">Password</label>
  <input type="password" id="inputPassword" class="form-control" placeholder="Password" required>
  <div class="checkbox mb-3">
   <label>
    <input type="checkbox" value="remember-me"> Remember me
   </label>
  </div>
  <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
  <p class="mt-5 mb-3 text-muted">&copy; 2017-2018</p>
</form>

""")))}),format.raw/*30.2*/("""
"""))
      }
    }
  }

  def render(message:String,assetsFinder:AssetsFinder): play.twirl.api.HtmlFormat.Appendable = apply(message)(assetsFinder)

  def f:((String) => (AssetsFinder) => play.twirl.api.HtmlFormat.Appendable) = (message) => (assetsFinder) => apply(message)(assetsFinder)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Jul 20 10:28:29 PET 2018
                  SOURCE: /home/clarkprincipe/AppsBussines/app/views/index.scala.html
                  HASH: de28ebc4d9b4a3c61df732c96f339de5ef56c3e6
                  MATRIX: 873->137|1021->192|1049->387|1077->389|1123->426|1163->428|1193->431|1273->484|1294->496|1360->541|2084->1235
                  LINES: 24->5|29->6|30->11|31->12|31->12|31->12|33->14|34->15|34->15|34->15|49->30
                  -- GENERATED --
              */
          