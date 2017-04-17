package command

class FileIOJob extends Job {

  var file: Option[FileIO] = None: Option[FileIO]

  def setFileIO(fileIO: FileIO): Unit = {
    file = Some(fileIO)
  }

  override def run(): Unit = {
    file.get.execute()
  }
}