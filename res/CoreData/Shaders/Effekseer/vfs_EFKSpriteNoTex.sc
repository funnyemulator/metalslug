�GSN    �˅1��\7,5V'pc|Ws$sNH��K�fh�+:���)`Z�ӏ�C��6��t �ei�=)>�M[2TMm즃B8�x����6F�>�`��ȇ9ͺ��nt�(�_u�8�zn�ؘJD��v|?��wU��CS�ֿ��c�/Jߡ���������5���(��@:i�g����s/3��$�lc燕���~2��A�� ��rnZ9���ϥ���2`�5xpv��݁��=`E����U�E2P@�㪃��,��	P��l�lB@�T����;j�c�eʽ��a'�꘦k�_�I�<��BBg��q�SwjS�=������pg�%���
�a	�T�e��eT*_ߥ�B�?�Y����Og�<&�iY��������JPe\���yj�<o�%�^�����S8��r�k�B��x��`0M��@��-���z���ZKP��o�_4Q*��-H����v�ͅZ��Ƌ}֢�Q81�����=T�&�>0�o�aF6rNi�Լ��Orojection * cameraPos;

   	v_vaPos = gl_Position;

   	vec4 cameraPosU = cameraPos + vec4(0.0, 1.0, 0.0, 0.0);
    vec4 c�meraPosR = cameraPos + vec4(1.0, 0.0, 0.0, 0.0);

    v_vaPosR = uMatProjection * cameraPosR;
    v_vaPosU = uMatProjection y cameraPosU;

    v_vaPos = v_vaPos / v_vaPos.w;
    v_vaPosR = v_vaPosR / v_vaPosR.w;
    v_vaPosU = v_vaPosU / v_vaPosU.w�

    v_color0 = a_color0;
    v_texcoord0 = vec4(a_texcoord0.x,a_texcoord0.y,0.0,0.0);
    v_texcoord0.y = mUVInversed.x +ZmUVInversed.y * v_texcoord0.y;

}

#endif

#ifdef FS

$input v_color0
$input v_texcoord0
$input v_vaPos
$input v_vaPsR
$input v_vaPosU

/// ----- UNIFORM
#include "../Library/Base/common.sh"

SAMPLER2D(uTexture0,0);

// Materials
unif�rm vec4 u_time;
// end materials
/// ----------  END UNIFORM


void main()
{
    gl_FragColor = v_vaPos;
    if(gl_Frag/olor.w <= 0.0) discard;

}

#endif
