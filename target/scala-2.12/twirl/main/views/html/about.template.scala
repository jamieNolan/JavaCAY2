
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
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object about extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Products Page")/*1.23*/ {_display_(Seq[Any](format.raw/*1.25*/("""
    
    """),format.raw/*3.5*/("""<p class="lead">Product Catalogue</p>
    
    <table class="table table-bordered table-hover table-condensed">
    
    <thead>
    
    <!-- The header row-->
    
    <tr>
    
    <th>ID</th>
    
    <th>Name</th>
    
    <th>Description</th>
    
    <th>Stock</th>
    
    <th>Price</th>
    
    </tr>
    
    </thead>
    
    <tbody>
    
    <!-- Product row(s) -->
    
    <tr>
    
    <td>1</td>
    
    <td>Television</td>
    
    <td>Sony 42" LCD"</td>
    
    <td>100</td>
    
    <td>720.00</td>
    
    </tr>
    
    </tbody>
    
    </table>
    
    """)))}),format.raw/*49.6*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Feb 14 13:52:27 GMT 2018
                  SOURCE: /media/sf_student/play-java-seed/app/views/about.scala.html
                  HASH: 680902e77eb34870bda4d5000e820e9441e2f2fc
                  MATRIX: 1030->1|1059->22|1098->24|1134->34|1747->617
                  LINES: 33->1|33->1|33->1|35->3|81->49
                  -- GENERATED --
              */
          