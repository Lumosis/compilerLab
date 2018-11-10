

set(command "${make}")
execute_process(
  COMMAND ${command}
  RESULT_VARIABLE result
  OUTPUT_FILE "/home/lumos/courses/compilerH/PB16050176/c1recognizer/build/externals/antlr4cpp/src/antlr4cpp-stamp/antlr4cpp-build-out.log"
  ERROR_FILE "/home/lumos/courses/compilerH/PB16050176/c1recognizer/build/externals/antlr4cpp/src/antlr4cpp-stamp/antlr4cpp-build-err.log"
  )
if(result)
  set(msg "Command failed: ${result}\n")
  foreach(arg IN LISTS command)
    set(msg "${msg} '${arg}'")
  endforeach()
  set(msg "${msg}\nSee also\n  /home/lumos/courses/compilerH/PB16050176/c1recognizer/build/externals/antlr4cpp/src/antlr4cpp-stamp/antlr4cpp-build-*.log")
  message(FATAL_ERROR "${msg}")
else()
  set(msg "antlr4cpp build command succeeded.  See also /home/lumos/courses/compilerH/PB16050176/c1recognizer/build/externals/antlr4cpp/src/antlr4cpp-stamp/antlr4cpp-build-*.log")
  message(STATUS "${msg}")
endif()
