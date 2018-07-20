
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

  /**/
  def apply/*2.2*/(message: String)(implicit assetsFinder: AssetsFinder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""

"""),_display_(/*5.2*/main("Welcome to Play", assetsFinder)/*5.39*/ {_display_(Seq[Any](format.raw/*5.41*/("""

 """),format.raw/*7.2*/("""<form class="form-signin">
  <img class="mb-4" src=""""),_display_(/*8.27*/assetsFinder/*8.39*/.path("images/bootstrap/bootstrap-solid.svg")),format.raw/*8.84*/("""" alt="" width="72" height="72">
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




<h1>hola</h1>

""")))}),format.raw/*28.2*/("""
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
                  DATE: Fri Jul 20 12:21:12 PET 2018
                  SOURCE: /home/clarkprincipe/AppsBussines/app/views/index.scala.html
                  HASH: cde09ef02f0578c3d4768c3bbd9b2cae2cb55fcb
                  MATRIX: 742->2|890->57|918->60|963->97|1002->99|1031->102|1110->155|1130->167|1195->212|1937->924
                  LINES: 21->2|26->3|28->5|28->5|28->5|30->7|31->8|31->8|31->8|51->28
                  -- GENERATED --
              */
          