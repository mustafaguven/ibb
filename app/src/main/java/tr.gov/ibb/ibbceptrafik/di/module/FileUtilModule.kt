package tr.gov.ibb.ibbceptrafik.di.module

import tr.gov.ibb.ibbceptrafik.utility.FileUtil
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class FileUtilModule {

  @Singleton
  @Provides
  fun providesFileUtil(): FileUtil = FileUtil()

}