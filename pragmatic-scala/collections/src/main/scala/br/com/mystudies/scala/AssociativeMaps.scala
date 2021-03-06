package br.com.mystudies.scala

object AssociativeMaps extends App{

     val feeds = Map(
        "Andy Hunt" -> "blog.tooshed.com",
        "Dave Thomas" -> "pragdave.me",
        "NFJS" -> "nofluffjuststuff.com/blog"
      )


       // filter by key
      val filterNamesStartWithD = feeds filterKeys { _ startsWith "D" }
      println(s"# of Filtered: ${filterNamesStartWithD.size}")


     // filter on the values
      val filterNameStartWithDAndPragInFeed = feeds filter {elem =>
        val (key, value) = elem
       (key startsWith "D") && (value contains "prag")
      }

      println(s"# of feeds with auth name D* and pragprog in URL: ${filterNameStartWithDAndPragInFeed.size}")


     // get Some[T] or None
      println(s"Get And's Feed: ${feeds get "Andy Hunt"}")
      println(s"Get Bills's Feed: ${feeds get "Bill Who"}")


      // apply method to get
      try{
        println(s"Get And's Feed Using Apply: ${feeds("Andy Hunt")}")
        print("Get Bill's Feed: ")
        println(feeds("Bill who"))
      }
      catch{
        case ex: java.util.NoSuchElementException => println("Not Found")
      }


      // updated
      val newFeeds1 = feeds.updated("Robson Duarte", "https://twitter.com/robsonoduarte")
      println(s"Robson's blog in original feeds: ${feeds.get("Robson Duarte")}")
      println(s"Robson's blog in new feeds: ${newFeeds1.get("Robson Duarte")}")


      // update in mutable map
      val mutableFeeds = scala.collection.mutable.Map(
            "Scala Book Forum" -> "forums.pragprog.com/forum/87"
          )
      mutableFeeds("Groovy Book Forum") = "forums.pragprog.com/forum/246"
      println(s"Number of forums: ${mutableFeeds.size}")
}
