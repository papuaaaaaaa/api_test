/**
 * Created by papua on 2014/12/22.
 */
// app/models/customContext.scala
package models

import com.novus.salat._
import com.novus.salat.dao._
import com.mongodb.casbah.Imports._
import play.api.Play
import play.api.Play.current

package object customContext {
  implicit val context = {
    val context = new Context {                                bu
      val name = "custom"
    }
    context.registerGlobalKeyOverride(remapThis = "id", toThisInstead = "_id")
    context.registerClassLoader(Play.classloader)
    context
  }
}