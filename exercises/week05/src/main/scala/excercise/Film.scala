package excercise

/**
  * Created by fatos on 26/03/2017.
  */

case class Film(name: String, yearOfRelease: Int, imdbRating: Double, director: Director) {

  def directorsAge = director.yearOfBirth

  def isDirectedBy(d: Director): Boolean = {
    d.name == director.name
  }

  def copy(name: String = this.name, yearOfRelease: Int = yearOfRelease, imdbRating: Double = imdbRating,
           director: Director = director): Film = {
    new Film(name,yearOfRelease,imdbRating,director)
  }
}


object Film {
//  def apply(name: String, yearOfRelease: Int, imdbRating: Double, director: Director): Film =
//    new Film(name, yearOfRelease, imdbRating, director)

  def highestRating(f1: Film, f2: Film): Film = {
    if (f1.imdbRating > f2.imdbRating) f1 else f2
  }

  def oldestDirectorAtTheTime(f1: Film, f2: Film): Director = {
    val d1 = f1.director.yearOfBirth - f1.yearOfRelease
    val d2 = f2.director.yearOfBirth - f2.yearOfRelease
    if (d1 > d2) f1.director else f2.director
  }
}