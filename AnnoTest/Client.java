
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Client {
	public static void main(String[] args){
		System.out.println("start annotation sample");
		SampleClass1 sc1 = new SampleClass1();
		SampleClass2 sc2 = new SampleClass2();

		//�w�肳��Ă���A�m�e�[�V�������擾����
		Annotation annotList[] = Info.class.getAnnotations();
		System.out.println("annotation size is [" + annotList.length + "]");
		for(int i=0; i<annotList.length; i++){
			Annotation anno = annotList[i];
			System.out.println("    annotation class is [" + anno.annotationType().getName() + "]");
		}

		/* ***CLASS�ɑ΂���A�m�e�[�V�����̎擾*** */
		//SampleClass1
		Annotation annotList1[] = SampleClass1.class.getAnnotations();
		System.out.println("SampleClass1's annotation size is [" + annotList1.length + "]");
		for(int i=0; i<annotList1.length; i++){
			Annotation anno1 = annotList1[i];
			System.out.println("    annotation class is [" + anno1.annotationType().getName() + "]");
		}
		//SampleClass2
		Annotation annotList2[] = SampleClass2.class.getAnnotations();
		System.out.println("SampleClass2's annotation size is [" + annotList2.length + "]");
		for(int i=0; i<annotList2.length; i++){
			Annotation anno2 = annotList2[i];
			System.out.println("    annotation class is [" + anno2.annotationType().getName() + "]");
		}
		System.out.println();
		System.out.println();

		/* ***METHOD�ɑ΂���A�m�e�[�V�����̎擾*** */
		//SampleClass1
		Method methodList1[] = SampleClass1.class.getMethods();
		System.out.println("SampleClass1's method count is [" + methodList1.length + "]");
		for(Method method : methodList1){
			System.out.println("    method name is [" + method.getName() + "]");
			for(Annotation annot : method.getAnnotations()){
				System.out.println("        method annotation is [" + annot.annotationType().getName() + "]");
			}
		}
		//SampleClass2
		Method methodList2[] = SampleClass1.class.getMethods();
		System.out.println("SampleClass2's method count is [" + methodList2.length + "]");
		for(Method method : methodList2){
			System.out.println("    method name is [" + method.getName() + "]");
			for(Annotation annot : method.getAnnotations()){
				System.out.println("        method annotation is [" + annot.annotationType().getName() + "]");
			}
		}
		System.out.println();
		System.out.println();

		/* ***FIELD�ɑ΂���A�m�e�[�V�����̎擾 *** */
		//SampleClass1
		Field fieldList1[] = SampleClass1.class.getFields();
		System.out.println("SampleClass1 has  [" + fieldList1.length + "] fields");
		for(Field field : fieldList1){
			System.out.println("     field name is [" + field.getName() +"]");
			for(Annotation annot : field.getAnnotations()){
				System.out.println("        field annotation is [" + annot.annotationType().getName() + "]");
			}
		}
		//SampleClass1
		Field fieldList2[] = SampleClass2.class.getDeclaredFields();//getFields();
		System.out.println("SampleClass2 has  [" + fieldList2.length + "] fields");
		for(Field field : fieldList2){
			System.out.println("     field name is [" + field.getName() +"]");
			for(Annotation annot : field.getAnnotations()){
				System.out.println("        field annotation is [" + annot.annotationType().getName() + "]");
			}
		}
		System.out.println();
		System.out.println();

		//����̃��\�b�h�ɑ΂���A�m�e�[�V���������擾����(���t���N�V����)
		//try{
		//	Info annos = SampleClass1.class.getMethod("initList", new Class.class.newInstance()).getAnnotation(Info.class);
		//	System.out.println(annos);
		//}catch(Exception e){
		//	e.printStackTrace();
		//}
	}

}
