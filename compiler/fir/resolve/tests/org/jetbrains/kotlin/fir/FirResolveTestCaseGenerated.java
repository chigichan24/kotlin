/*
 * Copyright 2010-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.fir;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/fir/resolve/testData/resolve")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class FirResolveTestCaseGenerated extends AbstractFirResolveTestCase {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
    }

    public void testAllFilesPresentInResolve() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/fir/resolve/testData/resolve"), Pattern.compile("^([^.]+)\\.kt$"), TargetBackend.ANY, true, "stdlib");
    }

    @TestMetadata("companion.kt")
    public void testCompanion() throws Exception {
        runTest("compiler/fir/resolve/testData/resolve/companion.kt");
    }

    @TestMetadata("derivedClass.kt")
    public void testDerivedClass() throws Exception {
        runTest("compiler/fir/resolve/testData/resolve/derivedClass.kt");
    }

    @TestMetadata("enum.kt")
    public void testEnum() throws Exception {
        runTest("compiler/fir/resolve/testData/resolve/enum.kt");
    }

    @TestMetadata("F.kt")
    public void testF() throws Exception {
        runTest("compiler/fir/resolve/testData/resolve/F.kt");
    }

    @TestMetadata("fakeRecursiveSupertype.kt")
    public void testFakeRecursiveSupertype() throws Exception {
        runTest("compiler/fir/resolve/testData/resolve/fakeRecursiveSupertype.kt");
    }

    @TestMetadata("fakeRecursiveTypealias.kt")
    public void testFakeRecursiveTypealias() throws Exception {
        runTest("compiler/fir/resolve/testData/resolve/fakeRecursiveTypealias.kt");
    }

    @TestMetadata("ft.kt")
    public void testFt() throws Exception {
        runTest("compiler/fir/resolve/testData/resolve/ft.kt");
    }

    @TestMetadata("functionTypes.kt")
    public void testFunctionTypes() throws Exception {
        runTest("compiler/fir/resolve/testData/resolve/functionTypes.kt");
    }

    @TestMetadata("genericFunctions.kt")
    public void testGenericFunctions() throws Exception {
        runTest("compiler/fir/resolve/testData/resolve/genericFunctions.kt");
    }

    @TestMetadata("nestedClass.kt")
    public void testNestedClass() throws Exception {
        runTest("compiler/fir/resolve/testData/resolve/nestedClass.kt");
    }

    @TestMetadata("NestedOfAliasedType.kt")
    public void testNestedOfAliasedType() throws Exception {
        runTest("compiler/fir/resolve/testData/resolve/NestedOfAliasedType.kt");
    }

    @TestMetadata("NestedSuperType.kt")
    public void testNestedSuperType() throws Exception {
        runTest("compiler/fir/resolve/testData/resolve/NestedSuperType.kt");
    }

    @TestMetadata("simpleClass.kt")
    public void testSimpleClass() throws Exception {
        runTest("compiler/fir/resolve/testData/resolve/simpleClass.kt");
    }

    @TestMetadata("simpleTypeAlias.kt")
    public void testSimpleTypeAlias() throws Exception {
        runTest("compiler/fir/resolve/testData/resolve/simpleTypeAlias.kt");
    }

    @TestMetadata("treeSet.kt")
    public void testTreeSet() throws Exception {
        runTest("compiler/fir/resolve/testData/resolve/treeSet.kt");
    }

    @TestMetadata("TwoDeclarationsInSameFile.kt")
    public void testTwoDeclarationsInSameFile() throws Exception {
        runTest("compiler/fir/resolve/testData/resolve/TwoDeclarationsInSameFile.kt");
    }

    @TestMetadata("typeAliasWithGeneric.kt")
    public void testTypeAliasWithGeneric() throws Exception {
        runTest("compiler/fir/resolve/testData/resolve/typeAliasWithGeneric.kt");
    }

    @TestMetadata("typeParameterInPropertyReceiver.kt")
    public void testTypeParameterInPropertyReceiver() throws Exception {
        runTest("compiler/fir/resolve/testData/resolve/typeParameterInPropertyReceiver.kt");
    }

    @TestMetadata("typeParameterVsNested.kt")
    public void testTypeParameterVsNested() throws Exception {
        runTest("compiler/fir/resolve/testData/resolve/typeParameterVsNested.kt");
    }

    @TestMetadata("compiler/fir/resolve/testData/resolve/builtins")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Builtins extends AbstractFirResolveTestCase {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInBuiltins() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/fir/resolve/testData/resolve/builtins"), Pattern.compile("^([^.]+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("lists.kt")
        public void testLists() throws Exception {
            runTest("compiler/fir/resolve/testData/resolve/builtins/lists.kt");
        }
    }

    @TestMetadata("compiler/fir/resolve/testData/resolve/fromBuilder")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class FromBuilder extends AbstractFirResolveTestCase {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInFromBuilder() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/fir/resolve/testData/resolve/fromBuilder"), Pattern.compile("^([^.]+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("complexTypes.kt")
        public void testComplexTypes() throws Exception {
            runTest("compiler/fir/resolve/testData/resolve/fromBuilder/complexTypes.kt");
        }

        @TestMetadata("enums.kt")
        public void testEnums() throws Exception {
            runTest("compiler/fir/resolve/testData/resolve/fromBuilder/enums.kt");
        }

        @TestMetadata("noPrimaryConstructor.kt")
        public void testNoPrimaryConstructor() throws Exception {
            runTest("compiler/fir/resolve/testData/resolve/fromBuilder/noPrimaryConstructor.kt");
        }

        @TestMetadata("simpleClass.kt")
        public void testSimpleClass() throws Exception {
            runTest("compiler/fir/resolve/testData/resolve/fromBuilder/simpleClass.kt");
        }

        @TestMetadata("typeParameters.kt")
        public void testTypeParameters() throws Exception {
            runTest("compiler/fir/resolve/testData/resolve/fromBuilder/typeParameters.kt");
        }
    }

    @TestMetadata("compiler/fir/resolve/testData/resolve/multifile")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Multifile extends AbstractFirResolveTestCase {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInMultifile() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/fir/resolve/testData/resolve/multifile"), Pattern.compile("^([^.]+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("Annotations.kt")
        public void testAnnotations() throws Exception {
            runTest("compiler/fir/resolve/testData/resolve/multifile/Annotations.kt");
        }

        @TestMetadata("ByteArray.kt")
        public void testByteArray() throws Exception {
            runTest("compiler/fir/resolve/testData/resolve/multifile/ByteArray.kt");
        }

        @TestMetadata("NestedSuperType.kt")
        public void testNestedSuperType() throws Exception {
            runTest("compiler/fir/resolve/testData/resolve/multifile/NestedSuperType.kt");
        }

        @TestMetadata("sealedStarImport.kt")
        public void testSealedStarImport() throws Exception {
            runTest("compiler/fir/resolve/testData/resolve/multifile/sealedStarImport.kt");
        }

        @TestMetadata("simpleAliasedImport.kt")
        public void testSimpleAliasedImport() throws Exception {
            runTest("compiler/fir/resolve/testData/resolve/multifile/simpleAliasedImport.kt");
        }

        @TestMetadata("simpleImport.kt")
        public void testSimpleImport() throws Exception {
            runTest("compiler/fir/resolve/testData/resolve/multifile/simpleImport.kt");
        }

        @TestMetadata("simpleImportNested.kt")
        public void testSimpleImportNested() throws Exception {
            runTest("compiler/fir/resolve/testData/resolve/multifile/simpleImportNested.kt");
        }

        @TestMetadata("simpleImportOuter.kt")
        public void testSimpleImportOuter() throws Exception {
            runTest("compiler/fir/resolve/testData/resolve/multifile/simpleImportOuter.kt");
        }

        @TestMetadata("simpleStarImport.kt")
        public void testSimpleStarImport() throws Exception {
            runTest("compiler/fir/resolve/testData/resolve/multifile/simpleStarImport.kt");
        }

        @TestMetadata("TypeAliasExpansion.kt")
        public void testTypeAliasExpansion() throws Exception {
            runTest("compiler/fir/resolve/testData/resolve/multifile/TypeAliasExpansion.kt");
        }
    }

    @TestMetadata("compiler/fir/resolve/testData/resolve/overrides")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Overrides extends AbstractFirResolveTestCase {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInOverrides() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/fir/resolve/testData/resolve/overrides"), Pattern.compile("^([^.]+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("simple.kt")
        public void testSimple() throws Exception {
            runTest("compiler/fir/resolve/testData/resolve/overrides/simple.kt");
        }

        @TestMetadata("simpleFakeOverride.kt")
        public void testSimpleFakeOverride() throws Exception {
            runTest("compiler/fir/resolve/testData/resolve/overrides/simpleFakeOverride.kt");
        }

        @TestMetadata("three.kt")
        public void testThree() throws Exception {
            runTest("compiler/fir/resolve/testData/resolve/overrides/three.kt");
        }
    }

    @TestMetadata("compiler/fir/resolve/testData/resolve/references")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class References extends AbstractFirResolveTestCase {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInReferences() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/fir/resolve/testData/resolve/references"), Pattern.compile("^([^.]+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("simple.kt")
        public void testSimple() throws Exception {
            runTest("compiler/fir/resolve/testData/resolve/references/simple.kt");
        }

        @TestMetadata("superMember.kt")
        public void testSuperMember() throws Exception {
            runTest("compiler/fir/resolve/testData/resolve/references/superMember.kt");
        }
    }
}
