# CMAKE generated file: DO NOT EDIT!
# Generated by "Unix Makefiles" Generator, CMake Version 3.12

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:


#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:


# Remove some rules from gmake that .SUFFIXES does not remove.
SUFFIXES =

.SUFFIXES: .hpux_make_needs_suffix_list


# Suppress display of executed commands.
$(VERBOSE).SILENT:


# A target that is always out of date.
cmake_force:

.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

# The shell in which to execute make rules.
SHELL = /bin/sh

# The CMake executable.
CMAKE_COMMAND = /usr/local/bin/cmake

# The command to remove a file.
RM = /usr/local/bin/cmake -E remove -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = /home/lumos/courses/compilerH/PB16050176/c1recognizer

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = /home/lumos/courses/compilerH/PB16050176/c1recognizer/build

# Utility rule file for antlr4cpp_generation_c1_recognizer.

# Include the progress variables for this target.
include CMakeFiles/antlr4cpp_generation_c1_recognizer.dir/progress.make

CMakeFiles/antlr4cpp_generation_c1_recognizer: ../grammar/C1Lexer.g4
CMakeFiles/antlr4cpp_generation_c1_recognizer: ../grammar/C1Parser.g4
	/usr/local/bin/cmake -E make_directory /home/lumos/courses/compilerH/PB16050176/c1recognizer/build/antlr4cpp_generated_src
	/usr/bin/java -jar /home/lumos/下载/antlr-4.7.1-complete.jar -Werror -Dlanguage=Cpp -listener -visitor -o /home/lumos/courses/compilerH/PB16050176/c1recognizer/build/antlr4cpp_generated_src/c1_recognizer -package c1_recognizer /home/lumos/courses/compilerH/PB16050176/c1recognizer/grammar/C1Lexer.g4 /home/lumos/courses/compilerH/PB16050176/c1recognizer/grammar/C1Parser.g4

antlr4cpp_generation_c1_recognizer: CMakeFiles/antlr4cpp_generation_c1_recognizer
antlr4cpp_generation_c1_recognizer: CMakeFiles/antlr4cpp_generation_c1_recognizer.dir/build.make

.PHONY : antlr4cpp_generation_c1_recognizer

# Rule to build all files generated by this target.
CMakeFiles/antlr4cpp_generation_c1_recognizer.dir/build: antlr4cpp_generation_c1_recognizer

.PHONY : CMakeFiles/antlr4cpp_generation_c1_recognizer.dir/build

CMakeFiles/antlr4cpp_generation_c1_recognizer.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles/antlr4cpp_generation_c1_recognizer.dir/cmake_clean.cmake
.PHONY : CMakeFiles/antlr4cpp_generation_c1_recognizer.dir/clean

CMakeFiles/antlr4cpp_generation_c1_recognizer.dir/depend:
	cd /home/lumos/courses/compilerH/PB16050176/c1recognizer/build && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /home/lumos/courses/compilerH/PB16050176/c1recognizer /home/lumos/courses/compilerH/PB16050176/c1recognizer /home/lumos/courses/compilerH/PB16050176/c1recognizer/build /home/lumos/courses/compilerH/PB16050176/c1recognizer/build /home/lumos/courses/compilerH/PB16050176/c1recognizer/build/CMakeFiles/antlr4cpp_generation_c1_recognizer.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles/antlr4cpp_generation_c1_recognizer.dir/depend
